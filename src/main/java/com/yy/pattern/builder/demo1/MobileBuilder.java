package com.yy.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: MobileBuilder
 * @Description: 具体的构建者，用来构建摩拜单车对象
 * @Author: YY
 */
public class MobileBuilder extends Builder {

    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    public Bike createBike() {
        return bike;
    }
}
