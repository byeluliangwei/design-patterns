package cn.luliangwei.patterns.proxy;
/**
 * 
 * 一天一个设计模式之--Proxy.
 * </p>
 * 代理模式.
 * <pre>
 * 定义：
 *      为其他对象提供一种代理以控制对这个对象的访问
 * 
 * 模式结构：
 *  Subject：定义RealSubject和Proxy的共同接口,这样就可以在任何使用RealSubject的地方都可以使用Proxy
 *  RealSubject:定义Proxy所代表的真实的实体
 *  Proxy：保存一个RealSubject的引用使得代理可以访问实体,从而可以操作真实对象，并提供一个与Sbuject的接口相同的接口,这样代理就可以用来代替实体
 * 
 * 应用：
 *      远程代理：为一个对象在不同的地址空间提供局部代表，这样就可以隐藏一个对象存在于不同的地址空间
 *      虚拟代理：根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象
 *      安全代理：用来控制真实对象访问时的权限
 *      计数代理：
 *      动态代理：
 *      
 * 本例说明：
 *  小明想买一个iPhone X ，但是国内还没有开始卖，这种情况下只有找代购
 *  这里的Subject 就是买 iPhone X
 *  代购就是Proxy
 *  小明买，就是一个RealSubject
 *  
 *  代理模式和装饰模式的区别：
 *      代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
 *      装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 * 
 * </pre>
 *
 * @author luliangwei
 * @since 2018年7月10日20:38:03
 */
public class Proxy implements Subject{

    //保存一个引用
    private BuyIphone buyIphone;
    
    
    public Proxy(BuyIphone buyIphone) {
        super();
        this.buyIphone = buyIphone;
    }

    @Override
    public void buyIphoneX() {
        if(buyIphone == null) {
            System.out.println("没人买 iPhone X");
        }
        System.out.println("=====>>代购买手机去了");
        buyIphone.buyIphoneX();
    }

}
