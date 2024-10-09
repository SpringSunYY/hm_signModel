package com.yy.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.iterator
 * @Author: YY
 * @CreateTime: 2024-10-09  11:50
 * @Description: StudentAggregateImpl
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * @Version: 1.0
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();  // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
