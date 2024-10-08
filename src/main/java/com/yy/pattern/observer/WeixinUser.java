package com.yy.pattern.observer;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.observer
 * @Author: YY
 * @CreateTime: 2024-10-08  19:28
 * @Description: WeixinUser
 * ConcreteSubject：具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，
 * 在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 * @Version: 1.0
 */
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}