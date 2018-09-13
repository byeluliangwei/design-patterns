package cn.luliangwei.patterns.observe;

/**
 * 
 * 抽象的观察者，具有接收消息的方法
 * 这个方法按照具体的业务情景来，是一个抽象的方法，所有具体的参与者实现它.
 * @author luliangwei
 */
public abstract class Observer {

    public abstract String receive(String receiveMessag);
}
