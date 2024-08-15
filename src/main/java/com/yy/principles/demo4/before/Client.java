package com.yy.principles.demo4.before;

import com.yy.principles.demo4.before.YYSafetyDoor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        YYSafetyDoor door = new YYSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
