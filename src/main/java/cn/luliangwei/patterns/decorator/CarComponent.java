package cn.luliangwei.patterns.decorator;
/*
 * 抽象的车类,具有车的共同属性
 * 即装饰模式中的Component
 */
public abstract class CarComponent {

    protected String engine = "VOVOL ENGINE";

    public void show() {
        System.out.println("引擎："+ this.engine);
    }
    
}
