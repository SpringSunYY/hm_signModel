package com.yy.principles.demo4.before;

/**
 * @version v1.0
 * @ClassName: HeimaSafetyDoor
 * @Description: 黑马品牌的安全门
 * @Author: YY
 */
public class HeimaSafetyDoor implements SafetyDoor {
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
