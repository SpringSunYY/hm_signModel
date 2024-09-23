package com.yy.pattern.adapter.object_adapter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.adapter.class_adapter
 * @Author: YY
 * @CreateTime: 2024-09-23  15:29
 * @Description: TFCard 适配者类的接口
 * @Version: 1.0
 */
public interface TFCard {
    //读取TF卡方法
    String readTF();

    //写入TF卡功能
    void writeTF(String msg);
}
