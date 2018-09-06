package cn.luliangwei.patterns.factorymethod;
/*
 * 减法工厂
 */
public class SubFactory implements FactoryMethod{

    /*
     * 创建减法类的实例
     */
    @Override
    public Calculation createInstance() {
        return new Subtraction();
    }

}
