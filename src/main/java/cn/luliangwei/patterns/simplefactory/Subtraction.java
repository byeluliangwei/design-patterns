package cn.luliangwei.patterns.simplefactory;
/**
 * 减法计算类
 */
public class Subtraction extends Calculation{

    @Override
    public double calculation(double a, double b) {
        
        return a - b;
    }

}
