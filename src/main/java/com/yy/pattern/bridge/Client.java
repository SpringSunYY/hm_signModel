package com.yy.pattern.bridge;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.bridge
 * @Author: YY
 * @CreateTime: 2024-09-25  15:22
 * @Description: Client 桥接模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}
