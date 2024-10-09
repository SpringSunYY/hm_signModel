package com.yy.pattern.iterator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.iterator
 * @Author: YY
 * @CreateTime: 2024-10-09  11:47
 * @Description: Client
 * 迭代器模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student());
        studentAggregate.addStudent(new Student());
        studentAggregate.addStudent(new Student());

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            Student next = studentIterator.next();
        }
    }
}
