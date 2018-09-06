package cn.luliangwei.patterns.decorator;

/*
 * 轮子装饰器
 */
public class WheelDecorator extends Decorator{

    private int wheels;
    
    
    
    public WheelDecorator(int wheels) {
        super();
        this.wheels = wheels;
    }

    @Override
    public void show() {
        super.component.show();
        System.out.println("车轮数："+this.wheels + "个");
    }
}
