package cn.luliangwei.patterns.factorymethod;

/*
 * Test类 相当于客户端调用
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 在简单工厂中，客户端需要传入想要计算的类型，然后工厂创建一个合适的对象，逻辑判断在工厂中进行
         * 但是在工厂方法中，客户端需要自己决定去实例化哪一个类，相当于逻辑判断交给了客户端。
         */
        
        //客户端创建加法工厂
        FactoryMethod factory = new AddFactory();
        
        //加法工厂实例化了具体的加法计算类
        Calculation calculate = factory.createInstance();
        
        //直接进行计算
        double result = calculate.calculation(1, 3);
        System.out.println(result);
        
        //======================减法类似============================
    }
}
