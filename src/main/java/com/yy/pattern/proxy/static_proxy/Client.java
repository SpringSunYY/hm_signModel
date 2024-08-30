package com.yy.pattern.proxy.static_proxy;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行买票
        proxyPoint.sell();
    }
}
