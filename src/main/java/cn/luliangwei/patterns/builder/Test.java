package cn.luliangwei.patterns.builder;


/*
 * Test类 相当于客户端调用
 */
public class Test {

    public static void main(String[] args) {
        
        //1、客户需要买一个车，找到汽车老板和工作人员
        
        Director client = new Director();
        Builder builder = new VolvoBuilder(4, "VOLVO", "VOLVO XC90");
        
        //老板指挥工人去组装
        client.workers(builder);
        //工人组装完汽车
        ProductCar car = builder.build();
        //展示汽车
        car.showCar();
    }
}
