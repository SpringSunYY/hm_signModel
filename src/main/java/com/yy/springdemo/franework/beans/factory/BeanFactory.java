package com.yy.springdemo.franework.beans.factory;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans.factory
 * @Author: YY
 * @CreateTime: 2024-10-13  15:08
 * @Description: BeanFactory
 * 在该接口中定义IOC容器的统一规范即获取bean对象。
 * @Version: 1.0
 */
public interface BeanFactory {
    //根据bean对象的名称获取bean对象
    Object getBean(String name) throws Exception;

    //根据bean对象的名称获取bean对象，并进行类型转换
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
