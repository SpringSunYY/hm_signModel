package com.yy.springdemo.franework.beans;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans
 * @Author: YY
 * @CreateTime: 2024-10-13  14:37
 * @Description: PropertyValue
 * 用于封装bean的属性，体现到上面的配置文件就是封装bean标签的子标签property标签数据。
 * @Version: 1.0
 */
public class PropertyValue {
    private String name;
    private String ref;
    private String value;

    public PropertyValue() {
    }

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
