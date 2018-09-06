package cn.luliangwei.patterns.proxy;
/*
 * Test类 相当于客户端调用
 */
public class Test {

    public static void main(String[] args) {
        //小明想买手机
        BuyIphone buyIphone = new BuyIphone("XiaoMing");
        
        //找代购
        Proxy proxy = new Proxy(buyIphone);
        
        //代购去买iPhone X
        proxy.buyIphoneX();
    }
}
