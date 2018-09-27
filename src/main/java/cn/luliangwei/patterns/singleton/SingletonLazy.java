package cn.luliangwei.patterns.singleton;
/**
 * 
 * 懒汉式单例模式
 * 
 * 缺陷：效率不高，因为在任何时候只能有一个线程调用 getInstance() 方法。
 * 
 * 这里的synchronized相当于一个全局锁
 * 
 * 参考博客：http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/
 */
public class SingletonLazy {

    private static SingletonLazy instance;
    
    private SingletonLazy() {}
    
    //为保证同步,将此方法添加关键字:synchronized
    public static synchronized SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
