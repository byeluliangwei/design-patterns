package cn.luliangwei.patterns.strategy;

/**
 * 原价支付策略
 */
public class PaymentNormal extends PaymentStrategy{

    //原价支付
    @Override
    public double actualAmount(double oringinalPrice) {
        return oringinalPrice;
    }

}
