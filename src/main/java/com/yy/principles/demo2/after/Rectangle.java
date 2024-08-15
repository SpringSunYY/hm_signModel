package com.yy.principles.demo2.after;

/**
 * @Project: design_patterns
 * @Package: com.yy.principles.demo2.after
 * @Author: YY
 * @CreateTime: 2024-08-15  14:27
 * @Description: Rectangle 长方形
 * @Version: 1.0
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
