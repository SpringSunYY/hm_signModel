package com.yy.pattern.interpreter;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.interpreter
 * @Author: YY
 * @CreateTime: 2024-10-10  12:23
 * @Description: AbstractExpression
 * 抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 * @Version: 1.0
 */
//抽象角色AbstractExpression
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
