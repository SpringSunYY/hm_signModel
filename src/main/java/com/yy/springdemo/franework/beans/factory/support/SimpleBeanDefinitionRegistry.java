package com.yy.springdemo.franework.beans.factory.support;

import com.yy.springdemo.franework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans.factory.support
 * @Author: YY
 * @CreateTime: 2024-10-13  14:52
 * @Description: SimpleBeanDefinitionRegistry
 * 该类实现了BeanDefinitionRegistry接口，定义了Map集合作为注册表容器。
 * @Version: 1.0
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String, BeanDefinition>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[1]);
    }
}
