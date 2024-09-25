package com.yy.pattern.facede;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.facede
 * @Author: YY
 * @CreateTime: 2024-09-25  15:37
 * @Description: Client 外观模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("打开家电");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" ============================ ");
        facade.say("关闭家电");
    }
}
