package com.yy.principles.demo4.after;

/**
 * @version v1.0
 * @ClassName: HeiMaSafetyDoor
 * @Description: 
 * @Author: YY
 */
public class HeiMaSafetyDoor implements AntiTheft, Fireproof, Waterproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }

    public void waterproof() {
        System.out.println("防水");
    }
}
