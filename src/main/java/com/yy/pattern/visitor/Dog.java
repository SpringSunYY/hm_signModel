package com.yy.pattern.visitor;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.visitor
 * @Author: YY
 * @CreateTime: 2024-10-09  12:11
 * @Description: Dog
 * 具体元素（ConcreteElement）角色： 提供接受访问方法的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法。
 * @Version: 1.0
 */
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }
}
