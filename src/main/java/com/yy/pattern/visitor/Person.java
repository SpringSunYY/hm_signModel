package com.yy.pattern.visitor;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.visitor
 * @Author: YY
 * @CreateTime: 2024-10-09  12:09
 * @Description: Person
 * 抽象访问者（Visitor）角色：定义了对每一个元素`（Element）`访问的行为，它的参数就是可以访问的元素，它的方法个数理论上来讲与元素类个数（Element的实现类个数）是一样的，
 * 从这点不难看出，访问者模式要求元素类的个数不能改变。
 * @Version: 1.0
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
