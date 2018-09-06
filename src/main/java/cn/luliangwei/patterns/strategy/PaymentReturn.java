package cn.luliangwei.patterns.strategy;

/**
 * 返利支付策略
 */
public class PaymentReturn extends PaymentStrategy{

    //支持返利的最低金额
    private double condition;
    //返回的金额
    private double returnAmount;
    
    public  PaymentReturn(double condition,double returnAmount) {
        this.condition = condition;
        this.returnAmount = returnAmount;
    }
    
    /*
     * 满足条件,减去需要返回的金额
     * 不满足条件返回原价
     */
    @Override
    public double actualAmount(double oringinalPrice) {
        if(oringinalPrice >= condition) {
            return oringinalPrice - returnAmount;
        }
        return oringinalPrice;
    }

}
