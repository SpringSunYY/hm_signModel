package com.yy.pattern.command;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.command
 * @Author: YY
 * @CreateTime: 2024-09-30  15:45
 * @Description: SeniorChef
 * 实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。
 * 任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 * @Version: 1.0
 */
public class SeniorChef {

    public void makeFood(int num,String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
