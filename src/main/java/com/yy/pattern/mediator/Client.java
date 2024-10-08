package com.yy.pattern.mediator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.mediator
 * @Author: YY
 * @CreateTime: 2024-10-08  19:50
 * @Description: Client
 * 中介者模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("需要租三室的房子");
        houseOwner.constact("我这有三室的房子，你需要租吗？");
    }
}
