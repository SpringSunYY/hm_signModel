package com.yy.pattern.bridge;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.bridge
 * @Author: YY
 * @CreateTime: 2024-09-25  15:28
 * @Description: Mac 扩展抽象化（Refined  Abstraction）角色 ：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * @Version: 1.0
 */
public class Mac extends OperatingSystemVersion {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}