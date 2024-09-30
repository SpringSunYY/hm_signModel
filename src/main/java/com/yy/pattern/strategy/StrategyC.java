package com.yy.pattern.strategy;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.strategy
 * @Author: YY
 * @CreateTime: 2024-09-30  15:22
 * @Description: StrategyA
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 * @Version: 1.0
 */
public class StrategyC implements Strategy{

    public void show() {
        System.out.println("买一送三");
    }
}
