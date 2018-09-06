package cn.luliangwei.patterns.builder;
/**
 * 具体的沃尔沃Volvo建造者
 */
public class VolvoBuilder extends Builder{

    private ProductCar car;
    
    public VolvoBuilder(int wheels,String engine,String name) {
        this.car = new ProductCar();
        this.engine = engine;
        this.name = name;
        this.wheels = wheels;
    }
    
    @Override
    public void buildWheels() {
        this.car.setWheels(this.wheels);
    }

    @Override
    public void buildEngine() {
        this.car.setEngine(this.engine);
    }

    @Override
    public void buildName() {
        this.car.setName(this.name);
    }

    @Override
    public ProductCar build() {
        return this.car;
    }

}
