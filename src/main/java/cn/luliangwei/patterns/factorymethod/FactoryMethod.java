package cn.luliangwei.patterns.factorymethod;
/**
 * 
 * 一天一个设计模式之---工厂方法模式(Factory Method).
 * </p>
 * .
 * 原理：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * 
 * 模式结构：
 * Product：定义产品的接口
 * Creator：声明工厂方法，该方法返回一个Product类型的对象，声明工厂方法，返回一个抽象的产品
 * ConcreteProduct：具体的产品，实现Product接口
 * ConcreteCreator：定义工厂方法以返回一个ConcreteProduct实例，具体的工厂
 * 
 * 父类负责定义创建对象的公共接口，子类负责生成具体对象
 * 将子类的实例化延迟到其子类
 * 
 * 与简单工厂的区别：
 *      简单工厂的最大优点在于工厂中包含了必要的逻辑判断，根据客户端选择的条件动态的实例化相关的类，对于客户端来说，去除了与具体产品的依赖。但违背了开放封闭原则
 *      工厂方法模式，客户端需要决定实例化哪一个工厂来实现具体的产品实例，选择问题其实还是存在的，只是工厂方法把简单工厂的内部逻辑判断移动到了客户端代码来进行。
 *      以前是修改工厂类，现在是修改客户端
 * 
 *      工厂方法克服了简单工厂违背开放封闭的原则的缺点，保持了封装对象创建过程的优点。（使用了多态性）缺点是增加了额外的开发量，没新增一个类，就要新增一个具体的产品工厂
 * 本例说明：
 *      依旧采用计算类这一例子，修改简单工厂中的例子，变为工厂方法模式
 *      
 *      FactoryMethod：相当于结构中所述的Product，包含了创建Calculation计算类（是一个抽象的类或者接口）的方法，定义了一个产品Calculation
 *      Addition:具体的加法计算类，实现或者继承与Calculation，相当于具体的产品ConcreteProduct
 *      AddFactory：具体的算法工厂，就是相当于一个具体的产品，相当于结构中的ConcreteCreator
 *      createInstance：工厂方法，返回一个产品，这里的产品是计算类Calculation，相当于Creator
 *
 * @author luliangwei
 * @since 2018年8月1日18:55:57
 */
public interface FactoryMethod {

    Calculation createInstance();
}
