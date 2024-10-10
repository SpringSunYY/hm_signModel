package com.yy.pattern.interpreter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.interpreter
 * @Author: YY
 * @CreateTime: 2024-10-10  12:23
 * @Description: Value
 * 终结符表达式（Terminal  Expression）角色：是抽象表达式的子类，
 * 用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 * @Version: 1.0
 */
//终结符表达式角色
public class Value extends AbstractExpression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}
