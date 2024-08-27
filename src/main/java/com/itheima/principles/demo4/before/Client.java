package com.itheima.principles.demo4.before;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
