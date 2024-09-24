package com.yy.pattern.decorator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.decorator
 * @Author: YY
 * @CreateTime: 2024-09-24  20:05
 * @Description: FastFood 抽象构件（Component）角色 ：定义一个抽象接口以规范准备接收附加责任的对象。
 * @Version: 1.0
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();  //获取价格
}
