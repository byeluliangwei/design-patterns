package cn.luliangwei.patterns.strategy;
/**
 * <pre>
 * 抽象的支付策略,也可以定义成一个接口,根据具体的情况进行选择
 * 
 * </pre>
 */
public abstract class PaymentStrategy {

    //根据原价,返回执行具体的策略后的支付价格
    public abstract double actualAmount(double oringinalPrice);
}
