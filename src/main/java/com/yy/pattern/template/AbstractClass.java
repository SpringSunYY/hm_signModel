package com.yy.pattern.template;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.template
 * @Author: YY
 * @CreateTime: 2024-09-29  17:17
 * @Description: AbstractClass
 * 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 * @Version: 1.0
 */
public abstract class AbstractClass {

    //模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
    public final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }
    //基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种：
    //* 抽象方法(Abstract Method) ：一个抽象方法由抽象类声明、由其具体子类实现。
    //* 具体方法(Concrete Method) ：一个具体方法由一个抽象类或具体类声明并实现，其子类可以进行覆盖也可以直接继承。
    //* 钩子方法(Hook Method) ：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
    //  一般钩子方法是用于判断的逻辑方法，这类方法名一般为isXxx，返回值类型为boolean类型。
    public void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    public abstract void pourVegetable();

    //第四步：倒调味料是不一样
    public abstract void pourSauce();


    //第五步：翻炒是一样的，所以直接实现
    public void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
