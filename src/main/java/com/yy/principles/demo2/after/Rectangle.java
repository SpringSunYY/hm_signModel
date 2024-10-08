package com.yy.principles.demo2.after;

/**
 * @version v1.0
 * @ClassName: Rectangle
 * @Description: 长方形类
 * @Author: YY
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
