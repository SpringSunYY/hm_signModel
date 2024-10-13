package com.yy.springdemo.franework.utils;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.utils
 * @Author: YY
 * @CreateTime: 2024-10-13  15:21
 * @Description: StringUtils
 * @Version: 1.0
 */
public class StringUtils {
    private StringUtils() {

    }

    // userDao   ==>   setUserDao
    public static String getSetterMethodByFieldName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}