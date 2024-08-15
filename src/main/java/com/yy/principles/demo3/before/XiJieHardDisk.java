package com.yy.principles.demo3.before;

/**
 * @Project: design_patterns
 * @Package: com.yy.principles.demo3.before
 * @Author: YY
 * @CreateTime: 2024-08-15  14:39
 * @Description: XiJieHardDisk
 * @Version: 1.0
 */
public class XiJieHardDisk {
    //存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    //获取数据的方法
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
