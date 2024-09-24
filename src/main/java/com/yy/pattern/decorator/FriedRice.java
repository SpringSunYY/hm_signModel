package com.yy.pattern.decorator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.decorator
 * @Author: YY
 * @CreateTime: 2024-09-24  20:06
 * @Description: FriedRice 具体构件（Concrete  Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 * @Version: 1.0
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    public float cost() {
        return getPrice();
    }
}