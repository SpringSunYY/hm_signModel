package com.yy.pattern.iterator;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.iterator
 * @Author: YY
 * @CreateTime: 2024-10-09  11:49
 * @Description: StudentIterator
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、next() 等方法。
 * @Version: 1.0
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
