package com.yy.pattern.visitor;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.visitor
 * @Author: YY
 * @CreateTime: 2024-10-09  12:10
 * @Description: Animal
 * 抽象元素（Element）角色：定义了一个接受访问者的方法（`accept`），其意义是指，每一个元素都要可以被访问者访问。
 * @Version: 1.0
 */
public interface Animal {
    void accept(Person person);
}
