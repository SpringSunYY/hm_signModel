package com.yy.springdemo.franework.beans.factory.support;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans.factory.support
 * @Author: YY
 * @CreateTime: 2024-10-13  14:56
 * @Description: BeanDefinitionReader
 * BeanDefinitionReader是用来解析配置文件并在注册表中注册bean的信息。定义了两个规范：
 *
 * * 获取注册表的功能，让外界可以通过该对象获取注册表对象。
 * * 加载配置文件，并注册bean数据。
 * @Version: 1.0
 */
public interface BeanDefinitionReader {

    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
