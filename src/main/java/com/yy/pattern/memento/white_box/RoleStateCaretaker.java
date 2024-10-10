package com.yy.pattern.memento.white_box;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.memento.white_box
 * @Author: YY
 * @CreateTime: 2024-10-10  11:52
 * @Description: RoleStateCaretaker
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 * @Version: 1.0
 */
//角色状态管理者类
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
