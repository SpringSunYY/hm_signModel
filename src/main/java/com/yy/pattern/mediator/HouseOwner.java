package com.yy.pattern.mediator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.mediator
 * @Author: YY
 * @CreateTime: 2024-10-08  19:52
 * @Description: HouseOwner
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * @Version: 1.0
 */
//具体同事类 房屋拥有者
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与中介者联系
    public void constact(String message){
        mediator.constact(message, this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主" + name +"获取到的信息：" + message);
    }
}
