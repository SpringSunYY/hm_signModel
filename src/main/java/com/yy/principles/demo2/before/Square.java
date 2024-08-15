package com.yy.principles.demo2.before;

/**
 * @Project: design_patterns
 * @Package: com.yy.principles.demo2.before
 * @Author: YY
 * @CreateTime: 2024-08-15  14:16
 * @Description: Square 正方形类
 * @Version: 1.0
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
