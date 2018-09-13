package cn.luliangwei.patterns.observe;

/**
 * 
 * 具体的被观察对象，继承与抽象的被观察对象，其实它相当于是一个发布消息的实体，当这个实体生变化，
 * 每一个观察它的对象都能接收到这个变化
 * </p>
 * @author luliangwei
 */
public class Publisher extends Subject{

    private String publisheMessage;

    public Publisher(String message) {
        this.publisheMessage = message;
    }
    public Publisher() {
        
    }
    @Override
    public Observer addObserver(Observer observer) {
        observers.add(observer);
        return observer;
    }

    @Override
    public boolean deleteObserver(Observer observer) {
        return  observers.remove(observer);
    }

    @Override
    public void notification() {
        for(Observer obs : observers) {
             obs.receive(publisheMessage);
        }
    }

    public String getPublisheMessage() {
        return publisheMessage;
    }

    public void setPublisheMessage(String publisheMessage) {
        this.publisheMessage = publisheMessage;
    }
    
    
}
