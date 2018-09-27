package cn.luliangwei.patterns.singleton;

/**
 * 
 * 饥汉式单例模式
 * 
 * 缺点：
 *      单例会在加载类后一开始就被初始化，即使客户端没有调用 getInstance()方法。
 *      饥汉式的创建方式在一些场景中将无法使用：譬如 Singleton 实例的创建是依赖参数或者配置文件的，
 *      在 getInstance() 之前必须调用某个方法设置参数给它，那样这种单例写法就无法使用了。
 */
public class SingletonHunger {

    //类加载的时候就进行实例化
    private static final SingletonHunger instance = new SingletonHunger();
    
    private SingletonHunger() {}
    
    public static SingletonHunger getInstance() {
        return instance;
    }
}
