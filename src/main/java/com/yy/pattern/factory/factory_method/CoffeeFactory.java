package com.yy.pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassName: CoffeeFactory
 * @Description: CoffeeFactory ： 抽象工厂
 * @Author: YY
 */
public interface CoffeeFactory {

    //创建咖啡对象的方法
    Coffee createCoffee();
}
