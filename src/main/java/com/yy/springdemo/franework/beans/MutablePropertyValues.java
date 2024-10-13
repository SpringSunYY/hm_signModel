package com.yy.springdemo.franework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Project: design_patterns
 * @Package: com.yy.springdemo.franework.beans
 * @Author: YY
 * @CreateTime: 2024-10-13  14:39
 * @Description: MutablePropertyValues
 * 一个bean标签可以有多个property子标签，所以再定义一个MutablePropertyValues类，用来存储并管理多个PropertyValue对象。
 * @Version: 1.0
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = (propertyValueList != null ? propertyValueList : new ArrayList<PropertyValue>());
    }

    //获取所有的PropertyValue对象
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性值获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

    //获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

    //判断集合是否为空
    public boolean isEmpty() {
        return this.propertyValueList.isEmpty();
    }

    //添加PropertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue pv) {
        //如果已经有直接替换
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue currentPv = this.propertyValueList.get(i);
            if (currentPv.getName().equals(pv.getName())) {
                this.propertyValueList.set(i, new PropertyValue(pv.getName(),pv.getRef(), pv.getValue()));
                return this;
            }
        }
        this.propertyValueList.add(pv);
        return this;
    }

    //判断是否有指定的name属性值对象
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}