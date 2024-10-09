package com.yy.pattern.iterator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.iterator
 * @Author: YY
 * @CreateTime: 2024-10-09  11:50
 * @Description: StudentAggregate
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 * @Version: 1.0
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
