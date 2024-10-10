package com.yy.pattern.interpreter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.interpreter
 * @Author: YY
 * @CreateTime: 2024-10-10  12:24
 * @Description: Variable
 * 终结符表达式（Terminal  Expression）角色：是抽象表达式的子类，用来实现文法中与终结符相关的操作，
 * 文法中的每一个终结符都有一个具体终结表达式与之相对应。
 * @Version: 1.0
 */
//终结符表达式角色 变量表达式
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}