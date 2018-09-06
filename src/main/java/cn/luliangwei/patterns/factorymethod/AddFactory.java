package cn.luliangwei.patterns.factorymethod;
/*
 * 加法  工厂
 */
public class AddFactory implements FactoryMethod {
    /*
     * 创建加法类的实例
     */
    @Override
    public Calculation createInstance() {
        return new Addition();
    }

}
