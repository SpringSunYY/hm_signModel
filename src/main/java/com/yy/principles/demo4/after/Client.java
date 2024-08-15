package com.yy.principles.demo4.after;


import com.itheima.principles.demo4.before.HeimaSafetyDoor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        //创建黑马安全门对象 创建安全门对象
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("============");
        //创建传智安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
