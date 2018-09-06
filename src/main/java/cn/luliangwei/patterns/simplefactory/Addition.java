package cn.luliangwei.patterns.simplefactory;

/**
 * 加法计算类
 */
public class Addition extends Calculation{

    @Override
    public double calculation(double a, double b) {
        
        return a + b;
    }

}
