package com.yy.pattern.singleton.demo2;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 同一个对象
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        //判断两次获取到的Singleton对象是否是同一个对象
        System.out.println(instance == instance1);
    }
}
