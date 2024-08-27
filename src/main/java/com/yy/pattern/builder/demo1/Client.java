package com.yy.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description:  * @Author: YY
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director = new Director(new MobileBuilder());
        //让指挥者只会组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
