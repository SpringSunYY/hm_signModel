package com.yy.pattern.adapter.class_adapter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.adapter.class_adapter
 * @Author: YY
 * @CreateTime: 2024-09-23  15:37
 * @Description: SDAdapterTF 定义适配器类（SD兼容TF）
 * @Version: 1.0
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
