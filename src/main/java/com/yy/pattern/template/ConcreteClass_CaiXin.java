package com.yy.pattern.template;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.template
 * @Author: YY
 * @CreateTime: 2024-09-29  17:20
 * @Description: ConcreteClass_CaiXin
 * 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。
 * @Version: 1.0
 */
public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}