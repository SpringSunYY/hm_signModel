package com.yy.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.visitor
 * @Author: YY
 * @CreateTime: 2024-10-09  12:13
 * @Description: Home
 * 对象结构（Object Structure）角色：定义当中所提到的对象结构，对象结构是一个抽象表述，具体点可以理解为一个具有容器性质或者复合对象特性的类，
 * 它会含有一组元素（`Element`），并且可以迭代这些元素，供访问者访问。
 * @Version: 1.0
 */
public class Home {
    private List<Animal> nodeList = new ArrayList<Animal>();

    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    //添加操作
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}

