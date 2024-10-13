package com.yy.springdemo.franework.context;

import com.yy.springdemo.franework.beans.factory.BeanFactory;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans.context
 * @Author: YY
 * @CreateTime: 2024-10-13  15:09
 * @Description: ApplicationContext
 * 该接口的所以的子实现类对bean对象的创建都是非延时的，所以在该接口中定义 `refresh()` 方法，该方法主要完成以下两个功能：
 *
 * * 加载配置文件。
 * * 根据注册表中的BeanDefinition对象封装的数据进行bean对象的创建。
 * @Version: 1.0
 */
public interface ApplicationContext extends BeanFactory {
    //进行配置文件加载并进行对象创建
    void refresh() throws IllegalStateException, Exception;
}
