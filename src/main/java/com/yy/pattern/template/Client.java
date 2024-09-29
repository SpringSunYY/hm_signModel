package com.yy.pattern.template;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.template
 * @Author: YY
 * @CreateTime: 2024-09-29  17:17
 * @Description: Client
 * 模版方法
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //炒手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        //炒蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
