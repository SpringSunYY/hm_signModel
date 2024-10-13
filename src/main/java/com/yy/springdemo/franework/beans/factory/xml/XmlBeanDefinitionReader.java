package com.yy.springdemo.franework.beans.factory.xml;

import com.yy.springdemo.franework.beans.BeanDefinition;
import com.yy.springdemo.franework.beans.MutablePropertyValues;
import com.yy.springdemo.franework.beans.PropertyValue;
import com.yy.springdemo.franework.beans.factory.support.BeanDefinitionReader;
import com.yy.springdemo.franework.beans.factory.support.BeanDefinitionRegistry;
import com.yy.springdemo.franework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans.factory.xml
 * @Author: YY
 * @CreateTime: 2024-10-13  14:57
 * @Description: XmlBeanDefinitionReader
 * XmlBeanDefinitionReader类是专门用来解析xml配置文件的。
 * @Version: 1.0
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {

        InputStream is = this.getClass().getClassLoader().getResourceAsStream(configLocation);
        SAXReader reader = new SAXReader();
        Document document = reader.read(is);
        Element rootElement = document.getRootElement();
        //解析bean标签
        parseBean(rootElement);
    }

    private void parseBean(Element rootElement) {

        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            List<Element> list = element.elements("property");
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            for (Element element1 : list) {
                String name = element1.attributeValue("name");
                String ref = element1.attributeValue("ref");
                String value = element1.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            beanDefinition.setPropertyValues(mutablePropertyValues);

            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}