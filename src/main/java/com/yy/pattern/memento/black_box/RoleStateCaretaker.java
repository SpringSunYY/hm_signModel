package com.yy.pattern.memento.black_box;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.memento.black_box
 * @Author: YY
 * @CreateTime: 2024-10-10  11:53
 * @Description: RoleStateCaretaker
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 * @Version: 1.0
 */
//角色状态管理者类
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}