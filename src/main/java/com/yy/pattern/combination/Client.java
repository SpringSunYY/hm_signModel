package com.yy.pattern.combination;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.combination
 * @Author: YY
 * @CreateTime: 2024-09-26  16:56
 * @Description: Client 组合模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("展开菜单", 3));
        menu2.add(new MenuItem("编辑菜单", 3));

        MenuComponent menu3 = new Menu("角色管理管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("编辑菜单", 3));

        //创建一级菜单
        MenuComponent component = new Menu("系统管理", 1);
        component.add(menu2);
        component.add(menu3);
        component.add(menu2);

        //打印菜单
        component.print();
    }
}
