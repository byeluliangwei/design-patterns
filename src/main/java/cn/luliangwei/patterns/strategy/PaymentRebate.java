package cn.luliangwei.patterns.strategy;
/**
 * 打折支付策略
 */
public class PaymentRebate extends PaymentStrategy{

    private double proporation;
   
    /*
     * 构造函数
     */
    public PaymentRebate(double proporation) {
        this.proporation = proporation;
    }
    
    /**
     * 根据打折的比例返回打折后的价格
     * 
     * 如果没有打折比例,则返回原价
     */
    @Override
    public double actualAmount(double oringinalPrice) {
        
        return proporation == 0 ? oringinalPrice : oringinalPrice * proporation;
    }

}
