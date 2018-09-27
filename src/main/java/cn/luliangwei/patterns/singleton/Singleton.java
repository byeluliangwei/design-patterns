package cn.luliangwei.patterns.singleton;

/**
 * <pre>
 * 单例模式（Singleton）
 * 
 * 概念：保证一个类仅有一个实例，并提供一个访问它的全局访问点。让类自身负责保存它的唯一实例，这个类可以保证没有其他实例可以被创建，
 *      并且它可以提供一个访问该实例的方法
 * 
 * 优点：可以严格的控制客户端怎么样访问这个实例，就是对唯一实例的受控访问
 * 
 * 
 * 懒汉式：类加载的时候不实例化单例，因此类加载速度快，但是运行时获取对象的速度慢
 * 饿汉式：类加载时就进行初始化，因此类加载慢，但是读取对象的速度快
 * 
 * <note>
 * 本例中的单例模式，在多线程环境下是不安全的
 * </pre>
 */
public class Singleton {

    //私有化实例对象
    private static Singleton instance;
    
    //私有化构造方法
    private Singleton() {}
    
    //提供外部获取实例的方法
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
