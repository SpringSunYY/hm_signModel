package com.yy.pattern.strategy;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.strategy
 * @Author: YY
 * @CreateTime: 2024-09-30  15:23
 * @Description: SalesMan
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 * @Version: 1.0
 */
public class SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}
