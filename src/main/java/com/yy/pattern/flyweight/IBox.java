package com.yy.pattern.flyweight;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.flyweight
 * @Author: YY
 * @CreateTime: 2024-09-26  17:25
 * @Description: IBox
 * 具体享元（Concrete Flyweight）角色 ：它实现了抽象享元类，称为享元对象；
 * 在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 * @Version: 1.0
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }
}
