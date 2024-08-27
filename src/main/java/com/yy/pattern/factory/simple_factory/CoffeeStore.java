package com.yy.pattern.factory.simple_factory;


/**
 * @version v1.0
 * @ClassName: CoffeeStore
 * @Description: 
 * @Author: YY
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }
}
