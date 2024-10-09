package com.yy.pattern.visitor;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.visitor
 * @Author: YY
 * @CreateTime: 2024-10-09  12:11
 * @Description: Owner
 * 具体访问者（ConcreteVisitor）角色：给出对每一个元素类访问时所产生的具体行为。
 * @Version: 1.0
 */

public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}