package com.yy.pattern.factory.factory_method;



/**
 * @version v1.0
 * @ClassName: CoffeeStore
 * @Description: 
 * @Author: YY
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
