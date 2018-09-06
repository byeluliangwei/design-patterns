package cn.luliangwei.patterns.strategy;
/*
 * Test类 相当于客户端调用
 */
public class Test {

    public static void main(String[] args) {
        
        //原价
        StrategyContext context = new StrategyContext(new PaymentNormal());
        System.out.println("原价：200");
        System.out.println("1、原价策略："+context.getPayment(200.0));
        
        //八折
        context = new StrategyContext(new PaymentRebate(0.8));
        System.out.println("原价：200");
        System.out.println("2、八折策略："+context.getPayment(200.0));
        
        //满300返100
        context = new StrategyContext(new PaymentReturn(300, 100));
        System.out.println("原价：400");
        System.out.println("3、满300返100策略：" + context.getPayment(400.0));
    }
    
}
