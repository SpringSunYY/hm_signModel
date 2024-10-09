package com.yy.pattern.visitor;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.visitor
 * @Author: YY
 * @CreateTime: 2024-10-09  12:09
 * @Description: Client
 * 访问者模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);
    }
}
