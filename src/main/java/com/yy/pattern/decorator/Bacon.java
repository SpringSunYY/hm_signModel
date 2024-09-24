package com.yy.pattern.decorator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.decorator
 * @Author: YY
 * @CreateTime: 2024-09-24  20:12
 * @Description: Bacon 具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * @Version: 1.0
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {

        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
