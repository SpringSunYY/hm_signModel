package com.yy.spring.service.impl;

import com.yy.spring.dao.UserDao;
import com.yy.spring.service.UserService;

/**
 * @Project: design_patterns
 * @Package: com.yy.spring.service.impl
 * @Author: YY
 * @CreateTime: 2024-10-13  14:04
 * @Description: UserServiceImpl
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userService创建");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userServiceImpl ...");
        userDao.add();
    }
}
