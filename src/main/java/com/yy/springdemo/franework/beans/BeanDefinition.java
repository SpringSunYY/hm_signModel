package com.yy.springdemo.franework.beans;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans
 * @Author: YY
 * @CreateTime: 2024-10-13  14:49
 * @Description: BeanDefinition
 * BeanDefinition类用来封装bean信息的，主要包含id（即bean对象的名称）、
 * class（需要交由spring管理的类的全类名）及子标签property数据。
 * @Version: 1.0
 */
public class BeanDefinition {
    private String id;
    private String className;

    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }
}
