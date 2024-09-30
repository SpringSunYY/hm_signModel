package com.yy.pattern.strategy;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.strategy
 * @Author: YY
 * @CreateTime: 2024-09-30  15:21
 * @Description: Client
 * 策略模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
