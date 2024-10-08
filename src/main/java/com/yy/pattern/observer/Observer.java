package com.yy.pattern.observer;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.observer
 * @Author: YY
 * @CreateTime: 2024-10-08  19:27
 * @Description: Observer
 * Observer：抽象观察者，是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 * @Version: 1.0
 */
public interface Observer {
    void update(String message);
}