package com.yy.pattern.bridge;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.bridge
 * @Author: YY
 * @CreateTime: 2024-09-25  15:23
 * @Description: VideoFile 视屏文件（实现化角色） 抽象化（Abstraction）角色 ：定义抽象类，并包含一个对实现化对象的引用。
 * @Version: 1.0
 */
public interface VideoFile {
    void decode(String fileName);
}
