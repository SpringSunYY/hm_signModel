package com.yy.pattern.bridge;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.bridge
 * @Author: YY
 * @CreateTime: 2024-09-25  15:24
 * @Description: AVIFile 具体实现化（Concrete Implementor）角色 ：给出实现化角色接口的具体实现。
 * @Version: 1.0
 */
public class AVIFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}
