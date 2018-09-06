package cn.luliangwei.patterns.decorator;
/**
 * 
 * 一天一个设计模式之--Decorator.
 * </p>
 * 装饰模式
 * <pre>
 * 定义：
 *      动态的给一个对象增加一些额外的职责.装饰模式在动态的为对象增加功能方面,优于继承
 *      装饰模式是利用SetComponent来为对象进行包装，使得每个装饰对象的实现就和如何使用这个对象分离开了,
 *      每个装饰对象只关心自己的功能,不需要关心如何被添加到对象链当中
 * 模式结构：
 *  Component:定义一个对象接口,可以给这些对象动态的添加职责.
 *  ConcreteComponent：一个具体的对象,继承与Component,可以为这个具体的对象添加一些职责.
 *  Decorator：装饰抽象类,继承了Component,从外类来扩展Component类的功能,但是对于Component来说时无需知道Decorator的存在的
 *  ConcreteDecorator：具体的装饰类,为Component添加具体的功能.
 *  
 *  本例说明：
 *  1、定义一个抽象的Car作为Component,然后定义几个具体的车,比如公交车,轿车,三轮车,摩托车...
 *  2、定义一个抽象的Decorator,用于为Car动态添加功能
 *  3、定义几个具体的功能,比如添加座位,添加不同的时速,添加颜色...
 *  
 *  
 *  代理模式和装饰模式的区别：
 *      两者的类图一模一样
 *  
 * JDK 的IO中就用到了装饰模式，例如：
 *      OutputStream out = new DataOutputStream（ new FileOutputStream（ "test.txt"） ）
 * </pre>
 * @author luliangwei
 * @since 2018年6月27日14:55:37
 * @version 0.0.1
 */
public abstract class Decorator extends CarComponent{

    protected CarComponent component;
    
    //设置需要装饰的具体对象
    public void setComponent(CarComponent component) {
        this.component = component;
    }
    
    @Override
    public void show() {
        this.component.show();
    }
}
