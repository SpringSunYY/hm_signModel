package com.yy.pattern.prototype.demo;

/**
 * @version v1.0
 * @ClassName: Realizetype
 * @Description:
 * @Author:  YY
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");

        return (Realizetype) super.clone();
    }
}
