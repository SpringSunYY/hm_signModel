package com.yy.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.interpreter
 * @Author: YY
 * @CreateTime: 2024-10-10  12:24
 * @Description: Context
 * 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，
 * 一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 * @Version: 1.0
 */
//环境类
public class Context {
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}
