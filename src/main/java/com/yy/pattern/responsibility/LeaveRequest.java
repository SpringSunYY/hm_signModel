package com.yy.pattern.responsibility;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.responsibility
 * @Author: YY
 * @CreateTime: 2024-10-07  19:55
 * @Description: LeaveRequest
 * @Version: 1.0
 */
//请假条
public class LeaveRequest {
    private String name;//姓名
    private int num;//请假天数
    private String content;//请假内容

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
