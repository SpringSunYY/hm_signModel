package com.yy.pattern.responsibility;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.responsibility
 * @Author: YY
 * @CreateTime: 2024-10-07  19:57
 * @Description: GeneralManager
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，
 * 判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 * @Version: 1.0
 */
//总经理
public class GeneralManager extends Handler {
    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
