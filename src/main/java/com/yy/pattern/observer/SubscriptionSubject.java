package com.yy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.observer
 * @Author: YY
 * @CreateTime: 2024-10-08  19:29
 * @Description: SubscriptionSubject
 * ConcreteSubject：具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，
 * 在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 * @Version: 1.0
 */
public class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
