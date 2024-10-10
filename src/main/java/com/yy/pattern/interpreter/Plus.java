package com.yy.pattern.interpreter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.interpreter
 * @Author: YY
 * @CreateTime: 2024-10-10  12:24
 * @Description: Plus
 * 非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，
 * 用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 * @Version: 1.0
 */
//非终结符表达式角色  加法表达式
public class Plus extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
