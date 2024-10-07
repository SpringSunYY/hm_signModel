package com.yy.pattern.state.before;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.state.before
 * @Author: YY
 * @CreateTime: 2024-10-07  20:18
 * @Description: Client
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);//电梯是停止的
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}
