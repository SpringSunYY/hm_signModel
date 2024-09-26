package com.yy.pattern.flyweight;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.flyweight
 * @Author: YY
 * @CreateTime: 2024-09-26  17:24
 * @Description: Client 享元模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getBox("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getBox("O");
        box2.display("绿色");

        AbstractBox box3 = BoxFactory.getInstance().getBox("L");
        box3.display("红色");


    }
}
