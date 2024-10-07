package com.yy.pattern.responsibility;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.responsibility
 * @Author: YY
 * @CreateTime: 2024-10-07  19:56
 * @Description: GroupLeader
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，
 * 判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 * @Version: 1.0
 */
//小组长
public class GroupLeader extends Handler {
    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
