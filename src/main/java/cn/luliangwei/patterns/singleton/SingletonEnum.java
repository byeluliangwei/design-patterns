package cn.luliangwei.patterns.singleton;

/**
 * 
 * 基于枚举的单例模式
 * 
 * 优点，太简单了
 * 且创建枚举默认就是线程安全的，而且还能防止反序列化导致重新创建对象
 * 
 * 调用的时候直接SingletonEnum.INSTANCE即可
 */
public enum SingletonEnum {

    INSTANCE;
    
}
