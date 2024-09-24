package com.yy.pattern.decorator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.decorator
 * @Author: YY
 * @CreateTime: 2024-09-24  20:09
 * @Description: Garnish 抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * @Version: 1.0
 */
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}
