package cn.luliangwei.patterns.observe;

/**
 * 具体的观察者
 * @author luliangwei
 */
public class ConcreteObserver2 extends Observer{

    protected String status = "睡觉";
    protected String name;
    
    public ConcreteObserver2(String name) {
        this.name = name;
    }

    @Override
    public String receive(String receiveMessag) {
        System.out.println("观察者/订阅者:"+ name + "----->收到发布的消息" + status);
        System.out.println("收到消息前的状态："+status);
        status = receiveMessag;
        System.out.println("收到消息后改变当前状态为："+ status);
        System.out.println();
        return status;
    }


    
}
