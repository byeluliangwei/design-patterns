package cn.luliangwei.patterns.simplefactory;
/**
 * 
 * 抽象的计算父类.
 * </p>
 * 此处也可以定义成一个接口interface
 *
 * @author luliangwei
 * @since 0.0.1
 */
public abstract class Calculation {

    protected double args1;
    protected double args2;
    
    public abstract double calculation(double a,double b);
}
