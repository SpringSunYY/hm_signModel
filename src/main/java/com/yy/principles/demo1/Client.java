package com.yy.principles.demo1;


/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 实现
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        //1,创建搜狗输入法对象
        SougouInput input = new SougouInput();
        //2,创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        YYSkin skin = new YYSkin();
        //3,将皮肤设置到输入法中
        input.setSkin(skin);
        //4,显示皮肤
        input.display();

        LzSkin lzSkin = new LzSkin();
        //3,将皮肤设置到输入法中
        input.setSkin(lzSkin);
        //4,显示皮肤
        input.display();
    }
}
