package com.yy.pattern.iterator;

import java.util.List;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.iterator
 * @Author: YY
 * @CreateTime: 2024-10-09  11:49
 * @Description: StudentIteratorImpl
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * @Version: 1.0
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}
