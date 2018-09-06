package cn.luliangwei.patterns.simplefactory;
/**
 * 测试
 */
public class Test {

    public static void main(String[] args) {
        
      double result = CalculationSimpleFactory.getInstance(Formula.ADD).calculation(1, 2);
      System.out.println(result);
      
      result = CalculationSimpleFactory.getInstance(Formula.SUB).calculation(3, 4);
      System.out.println(result);
    }
}
