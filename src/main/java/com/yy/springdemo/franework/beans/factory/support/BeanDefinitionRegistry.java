package com.yy.springdemo.franework.beans.factory.support;

import com.yy.springdemo.franework.beans.BeanDefinition;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans.factory.support
 * @Author: YY
 * @CreateTime: 2024-10-13  14:51
 * @Description: BeanDefinitionRegistry
 * BeanDefinitionRegistry接口定义了注册表的相关操作，定义如下功能：
 * * 注册BeanDefinition对象到注册表中
 * * 从注册表中删除指定名称的BeanDefinition对象
 * * 根据名称从注册表中获取BeanDefinition对象
 * * 判断注册表中是否包含指定名称的BeanDefinition对象
 * * 获取注册表中BeanDefinition对象的个数
 * * 获取注册表中所有的BeanDefinition的名称
 * @Version: 1.0
 */
public interface BeanDefinitionRegistry {

    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
