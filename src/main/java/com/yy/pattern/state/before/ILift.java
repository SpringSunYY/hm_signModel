package com.yy.pattern.state.before;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.state.before
 * @Author: YY
 * @CreateTime: 2024-10-07  20:16
 * @Description: ILift
 * 状态模式
 * @Version: 1.0
 */
public interface ILift {
    //电梯的4个状态
    //开门状态
    public final static int OPENING_STATE = 1;
    //关门状态
    public final static int CLOSING_STATE = 2;
    //运行状态
    public final static int RUNNING_STATE = 3;
    //停止状态
    public final static int STOPPING_STATE = 4;

    //设置电梯的状态
    public void setState(int state);

    //电梯的动作
    public void open();
    public void close();
    public void run();
    public void stop();
}
