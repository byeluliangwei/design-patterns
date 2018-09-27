package cn.luliangwei.patterns.singleton;

/**
 * 基于静态内部类(static nested class)的单例模式
 * 
 * 《Effective Java》中也推荐这个
 * 
 *  这种写法仍然使用JVM本身机制保证了线程安全问题；
 *  由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；
 *  同时读取实例的时候不会进行同步，没有性能缺陷；
 *  也不依赖 JDK 版本。
 *  
 *  <懒汉式>
 */
public class SingletonNestClass {

    private SingletonNestClass(){}
    
    public static SingletonNestClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    //私有内部类
    private static class SingletonHolder{
        private static final SingletonNestClass INSTANCE = new SingletonNestClass();
    }
}
