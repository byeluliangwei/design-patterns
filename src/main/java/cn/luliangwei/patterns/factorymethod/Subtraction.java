package cn.luliangwei.patterns.factorymethod;
/**
 * 减法计算类
 */
public class Subtraction extends Calculation{

    @Override
    public double calculation(double a, double b) {
        
        return a - b;
    }

}
