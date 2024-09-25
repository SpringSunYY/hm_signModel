package com.yy.pattern.facede;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.facede
 * @Author: YY
 * @CreateTime: 2024-09-25  15:38
 * @Description: SmartAppliancesFacade 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 * @Version: 1.0
 */
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    //起床后一键开电器
    private void on() {
        System.out.println("起床了");
        light.on();
        tv.on();
        airCondition.on();
    }

    //睡觉一键关电器
    private void off() {
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }
}
