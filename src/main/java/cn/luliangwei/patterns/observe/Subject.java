package cn.luliangwei.patterns.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 抽象的被观察的对象，维护一个观察者对象的集合
 * 具有添加和删除观察者对象的功能
 * 同时也具有通知功能.
 * </pre>
 * @author luliangwei
 */
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();
    
    
    public abstract Observer addObserver(Observer observer) ;
    
    public abstract boolean deleteObserver(Observer observer);
    
    public abstract void notification();
}
