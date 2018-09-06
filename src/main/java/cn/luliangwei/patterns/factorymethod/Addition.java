package cn.luliangwei.patterns.factorymethod;

/**
 * 加法计算类
 */
public class Addition extends Calculation{

    @Override
    public double calculation(double a, double b) {
        
        return a + b;
    }

}
