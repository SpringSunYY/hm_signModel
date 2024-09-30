package com.yy.pattern.command;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.command
 * @Author: YY
 * @CreateTime: 2024-09-30  15:45
 * @Description: Command
 * 抽象命令类（Command）角色： 定义命令的接口，声明执行的方法。
 * @Version: 1.0
 */
public interface Command {
    void execute();//只需要定义一个统一的执行方法
}
