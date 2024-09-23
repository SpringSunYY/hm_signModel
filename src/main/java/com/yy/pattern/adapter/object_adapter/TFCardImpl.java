package com.yy.pattern.adapter.object_adapter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.adapter.class_adapter
 * @Author: YY
 * @CreateTime: 2024-09-23  15:30
 * @Description: TFCardImpl 适配者类
 * @Version: 1.0
 */
public class TFCardImpl implements TFCard {
    public String readTF() {
        String msg = "tf card read msg : hello word tf card";
        return msg;
    }

    public void writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}
