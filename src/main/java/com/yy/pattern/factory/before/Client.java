package com.yy.pattern.factory.before;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description:
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        //1,创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        //2,点咖啡
        Coffee coffee = store.orderCoffee("american1");

        System.out.println(coffee.getName());
    }
}
