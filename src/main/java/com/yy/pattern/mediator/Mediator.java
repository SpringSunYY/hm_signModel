package com.yy.pattern.mediator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.mediator
 * @Author: YY
 * @CreateTime: 2024-10-08  19:50
 * @Description: Mediator
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * @Version: 1.0
 */
//抽象中介者
public abstract class Mediator {
    //申明一个联络方法
    public abstract void constact(String message,Person person);
}
