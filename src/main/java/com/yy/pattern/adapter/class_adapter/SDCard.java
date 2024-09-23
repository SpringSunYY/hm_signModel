package com.yy.pattern.adapter.class_adapter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.adapter.class_adapter
 * @Author: YY
 * @CreateTime: 2024-09-23  15:31
 * @Description: SDCard SD卡的接口
 * @Version: 1.0
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    void writeSD(String msg);
}
