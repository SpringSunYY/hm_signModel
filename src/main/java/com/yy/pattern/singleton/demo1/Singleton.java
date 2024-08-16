package com.yy.pattern.singleton.demo1;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.singleton.demo1
 * @Author: YY
 * @CreateTime: 2024-08-16  15:12
 * @Description: Singleton
 * @Version: 1.0
 */
/**
 * 饿汉式
 *      静态变量创建类的对象
 */
public class Singleton {
    //私有构造方法
    private Singleton() {}

    //在成员位置创建该类的对象
    private static Singleton instance = new Singleton();

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return instance;
    }
}
