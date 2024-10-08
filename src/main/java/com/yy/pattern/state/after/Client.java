package com.yy.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 状态模式
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯装填
        context.setLiftState(new ClosingState());

        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
