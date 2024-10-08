package com.yy.pattern.observer;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.observer
 * @Author: YY
 * @CreateTime: 2024-10-08  19:26
 * @Description: Client
 * 观察者模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();
        //创建微信用户
        WeixinUser user1 = new WeixinUser("孙悟空");
        WeixinUser user2 = new WeixinUser("猪悟能");
        WeixinUser user3 = new WeixinUser("沙悟净");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("荔枝软件开发工作室");
    }
}
