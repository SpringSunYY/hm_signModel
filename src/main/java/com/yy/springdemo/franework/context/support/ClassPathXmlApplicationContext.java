package com.yy.springdemo.franework.context.support;

import com.yy.springdemo.franework.beans.BeanDefinition;
import com.yy.springdemo.franework.beans.MutablePropertyValues;
import com.yy.springdemo.franework.beans.PropertyValue;
import com.yy.springdemo.franework.beans.factory.support.BeanDefinitionRegistry;
import com.yy.springdemo.franework.beans.factory.xml.XmlBeanDefinitionReader;
import com.yy.springdemo.franework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.context.support
 * @Author: YY
 * @CreateTime: 2024-10-13  15:14
 * @Description: ClassPathXmlApplicationContext
 * 该类主要是加载类路径下的配置文件，并进行bean对象的创建，主要完成以下功能：
 * * 在构造方法中，创建BeanDefinitionReader对象。
 * * 在构造方法中，调用refresh()方法，用于进行配置文件加载、创建bean对象并存储到容器中。
 * * 重写父接口中的getBean()方法，并实现依赖注入操作。
 * @Version: 1.0
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建XmlBeanDefinitionReader对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //根据bean的id属性值获取bean对象
    @Override
    public Object getBean(String name) throws Exception {

        //return singletonObjects.get(name);
        Object obj = singletonObjects.get(name);
        if(obj != null) {
            return obj;
        }

        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        if(beanDefinition == null) {
            return null;
        }
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if(ref != null && !ref.isEmpty()) {

                Object bean = getBean(ref);
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if(method.getName().equals(methodName)) {
                        method.invoke(beanObj,bean);
                    }
                }
            }

            if(value != null && !value.isEmpty()) {
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj,value);
            }
        }
        singletonObjects.put(name,beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {

        Object bean = getBean(name);
        if(bean != null) {
            return clazz.cast(bean);
        }
        return null;
    }
}
