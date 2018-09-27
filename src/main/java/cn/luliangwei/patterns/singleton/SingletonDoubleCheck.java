package cn.luliangwei.patterns.singleton;

/**
 * 双重检查锁模式(Double cheked locking pattern)的单例模式
 * 
 * 两次检查：
 *      因为会有两次检查 instance == null，一次是在同步块外，一次是在同步块内。
 *      
 * 缺陷：并不是一个原子操作
 * 原因：
 *      JVM中这对于instance = new Singleton()这个一段代码主要执行了下面三步。
 *      1、给 instance 分配内存
 *      2、调用 Singleton 的构造函数来初始化成员变量
 *      3、将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 *  但是在 JVM 的即时编译器中存在指令重排序的优化，所以就会出问题。
 * 
 * 解决：将instance变量声明成volatile
 */
public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck instance;
    
    private SingletonDoubleCheck() {}
    
    public static SingletonDoubleCheck getInstance() {
        if(instance == null) {                  //step1：check instance 
            synchronized (instance) {
                if(instance == null) {           //step2: check instance
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
