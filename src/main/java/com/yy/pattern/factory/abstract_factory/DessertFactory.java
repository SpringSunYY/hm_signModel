package com.yy.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassName: DessertFactory
 * @Description: 
 * @Author: YY
 */
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}
