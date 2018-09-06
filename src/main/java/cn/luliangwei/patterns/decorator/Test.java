package cn.luliangwei.patterns.decorator;
/*
 * Test类 相当于客户端调用
 */
public class Test {

    public static void main(String[] args) {
        MotoCarComponent motoCar = new MotoCarComponent();
        System.out.println("装饰前-----------------");
        motoCar.show();
        System.out.println("装饰后-----------------");
        //先起名字
        NameDecorator name = new NameDecorator("哈雷摩托");
        name.setComponent(motoCar);
        //加轮子
        WheelDecorator wheel = new WheelDecorator(2);
        wheel.setComponent(name);
        //加座位
        SeatDecorator seat = new SeatDecorator(2);
        seat.setComponent(wheel);
        
        seat.show();
        
        /*
         * 如果还要定义颜色,时速等功能,只需要定义不同的装饰器即可
         * 如果需要装饰汽车,火车等,只需要定义具体的车,然后进行装饰即可
         */
        
    }
}
