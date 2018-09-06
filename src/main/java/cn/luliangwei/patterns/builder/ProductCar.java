package cn.luliangwei.patterns.builder;

/**
 * 
 * 建造者模式中，具体的产品，这里是Car作为一个具体的产品.
 * </p>
 *
 * @author luliangwei
 * @since 2018年8月1日21:31:51
 */
public class ProductCar {
    // 一个车应该拥有的属性

    // 车子的轮子数
    private int wheels;
    // 车子的引擎名称
    private String engine;
    // 车子的名称
    private String name;

    public void showCar() {
        System.out.println("假装生产了一个："+ this.name + "汽车");
        System.out.println("============this is a new car============");
        System.out.println("carName:" + this.name);
        System.out.println("engine:" + this.engine);
        System.out.println("wheels:" + this.wheels);
        System.out.println("============show end============");
    }
    
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
