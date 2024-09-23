package com.yy.pattern.adapter.object_adapter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.adapter.class_adapter
 * @Author: YY
 * @CreateTime: 2024-09-23  15:32
 * @Description: SDCardImpl SD卡实现类
 * @Version: 1.0
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        String msg = "sd card read a msg :hello word SD";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
