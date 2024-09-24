package com.yy.pattern.decorator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.decorator
 * @Author: YY
 * @CreateTime: 2024-09-24  20:08
 * @Description: FriedNoodles 具体构件（Concrete  Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 * @Version: 1.0
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    public float cost() {
        return getPrice();
    }
}
