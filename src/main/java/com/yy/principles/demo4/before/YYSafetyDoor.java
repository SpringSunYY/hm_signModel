package com.yy.principles.demo4.before;

/**
 * @Project: design_patterns
 * @Package: com.yy.principles.demo4.before
 * @Author: YY
 * @CreateTime: 2024-08-15  20:20
 * @Description: YYSafetyDoor 安全门接口
 * @Version: 1.0
 */
public class YYSafetyDoor implements SafetyDoor{
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }
}
