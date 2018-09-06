package cn.luliangwei.patterns.builder;
/**
 * 
 * 一天一个设计模式之---建造者模式Builder.
 * </p>
 * .
 * 原理：
 *      将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 *      建造者模式更加关注零部件的装配顺序
 *      
 * 模式结构：
 * Director：指挥者，构建一个使用Builder接口的对象,不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 * Builder：为创建一个产品Product对象的各个部件指定的抽象接口,以规范产品对象的各个组成成分的建造。
 *          这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。
 * ConcreteBuilder：具体的建造者，实现Builder接口，构造和装配各个部件
 * Product：具体的产品
 * 
 * 优缺点：增加新的具体建造者无需修改原有类库的代码，易于拓展，符合“开闭原则“。 
 *      每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，
 *      用户使用不同的具体建造者即可得到不同的产品对象。
 *      将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰。
 *      将产品本身与产品创建过程进行解耦，可以使用相同的创建过程来得到不同的产品。也就说细节依赖抽象。
 *      但是需要待创建的对象具有较多的共性
 * 
 * 
 * 本例说明：
 *      客户去买汽车，他只需要知道自己买的什么车，什么类型的车即可，不用知道具体的车是怎么建造出来的
 *      
 *      本例中只建造了一个沃尔沃汽车，其他汽车类似
 * @author luliangwei
 * @since 2018年8月1日20:32:12
 */
public abstract class Builder {

    // 车子的轮子数
    protected int wheels;
    // 车子的引擎名称
    protected String engine;
    // 车子的名称
    protected String name;
    
    //构建汽车的轮子数量
    public abstract void buildWheels();
    //构造汽车的引擎类型
    public abstract void buildEngine();
    //构造汽车的名称
    public abstract void buildName();
    
    //构建一个车
    public abstract ProductCar build();
}
