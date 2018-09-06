package cn.luliangwei.patterns.strategy;
/**
 * 
 * 一天一个设计模式之--Strategy.
 * </p>
 * 策略模式.
 * <pre>
 * 定义：
 *    策略模式定义了算法家族,分别封装起来,让他们之间可以相互替换,此模式让算法的变化,不会影响到使用算法的客户.
 *    从概念上看,所有的算法完成的都是相同的工作,只是实现不同,可以以相同的方式调用所有算法,减少了各种算法类与使用算法类之间的耦合.
 *    它把每个要装饰的功能放在单独的类中,并让这个类包装它索要装饰的对象.
 * 优点：
 *    减少了各种算法类与使用算法类之间的耦合.
 *    简化了单元测试,因为每个算法都有自己的类,可以单独测试.
 *    可以用来封装几乎任何类型的规则.
 *    
 *  模式结构：
 *      Context：Context上下文用一个具体的策略对象ConcreteStrategy来配置,维护一个对Strategy对象的引用.
 *      Strategy：抽象的策略类,定义所有支持的算法的公共接口
 *      ConcreteStrategy：具体的策略类,封装了具体的算法或者行为,继承或者实现了Strategy类
 *      
 *  策略模式与简单工厂模式很类似,但是也有本质的区别：
 *      1、简单工厂模式是创建型模式,负责对象的创建;策略模式是行为模式,作用是让一个对象在多种行为(算法)中,选择其中一个.
 *      2、简单工厂模式关注的是对象的创建;策略模式是关注的行为的封装.
 *      3、简单工厂模式接收指令,创建符合要求的实例,解决的是资源的统一分发;策略模式解决的是策略的切换与扩展,让策略的变化独立于使用策略的用户.
 *      4、简单工厂相当于黑盒子,策略相当于白盒子.
 *
 *  本例说明：
 *      1、本例是定义一个支付的策略,根据不同的策略,计算出不同的商品单价.
 *      2、通过创建一个支付的抽象策略类,定义了原价,八折,满200省100等具体的计算策略.
 *  注：
 *      可以简单工厂结合
 * </pre>
 * @since 2018年6月25日16:08:09
 * @author luliangwei
 * @version 0.0.1
 */
public class StrategyContext {

    //维护一个抽象策略的引用
    private PaymentStrategy strategy;
    
    public StrategyContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double getPayment(double oringinalPrice) {
        return this.strategy.actualAmount(oringinalPrice);
    }
}
