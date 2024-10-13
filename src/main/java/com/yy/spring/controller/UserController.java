package com.yy.spring.controller;

import com.yy.spring.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Project: design_patterns
 * @Package: com.yy.spring.controller
 * @Author: YY
 * @CreateTime: 2024-10-13  14:04
 * @Description: UserController
 * @Version: 1.0
 */
public class UserController {
    public static void main(String[] args) {
        //创建spring容器对象
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //从IOC容器中获取UserService对象
        UserService userService = beanFactory.getBean("userService", UserService.class);
        //调用UserService对象的add方法
        userService.add();
    }
}
