package com.yy.pattern.template;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.template
 * @Author: YY
 * @CreateTime: 2024-09-29  17:19
 * @Description: ConcreteClass_BaoCai
 * 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。
 * @Version: 1.0
 */
public class ConcreteClass_BaoCai extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}