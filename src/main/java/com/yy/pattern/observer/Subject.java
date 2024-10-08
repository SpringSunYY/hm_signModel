package com.yy.pattern.observer;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.observer
 * @Author: YY
 * @CreateTime: 2024-10-08  19:27
 * @Description: Subject
 * Subject：抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，
 * 每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
 * @Version: 1.0
 */
public interface Subject {
    //增加订阅者
    public void attach(Observer observer);

    //删除订阅者
    public void detach(Observer observer);

    //通知订阅者更新消息
    public void notify(String message);
}
