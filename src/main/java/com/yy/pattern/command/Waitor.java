package com.yy.pattern.command;

import java.util.ArrayList;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.command
 * @Author: YY
 * @CreateTime: 2024-09-30  15:48
 * @Description: Waitor
 * 调用者/请求者（Invoker）角色： 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。
 * 这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 * @Version: 1.0
 */
public class Waitor {

    private ArrayList<Command> commands;//可以持有很多的命令对象

    public Waitor() {
        commands = new ArrayList();
    }

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    // 发出命令 喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
