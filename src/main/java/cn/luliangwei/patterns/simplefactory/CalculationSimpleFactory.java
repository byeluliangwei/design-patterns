package cn.luliangwei.patterns.simplefactory;

/**
 * 
 * 一天一个设计模式之--Simple Factory.
 * </p>
 * 又称为静态方法工厂
 * 
 * <pre>
 *  简单工厂模式不能说是一个设计模式，说它是一种编程习惯可能更恰当些。因为它至少不是Gof23种设计模式之一。
 *  原理：
 *      不需要知道创建具体类的细节,只需要传入相应的参数即可获取对应的类实例
 *  模式结构：
 *    Factory：工厂角色,负责实现创建所有具体产品类的实例.工厂类可以被外界直接调用,创建所需的产品对象.
 *    Product：抽象产品角色,是所有具体产品角色的父类.
 *    ConcreteProduct：具体产品角色,继承自抽象产品角色,一般为多个.
 *  优缺点：
 *      最大的问题在于工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，这一点与开闭原则是相违背的。
 *      当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。
 *      工厂中有部分逻辑，当添加的类越多的时候，工厂中的逻辑可能越复杂.
 *      
 *  模式适用环境:
 *      工厂类负责创建的对象比较少,由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
 *      客户端只知道传入工厂类的参数，对于如何创建对象不关心：客户端既不需要关心创建细节，甚至连类名都不需要记住，只需要知道类型所对应的参数。
 *  本例说明：
 *      1、本例是根据用户选择具体的计算方式,为用户创建相应的实例,然后对用户输入的两个数进行计算.
 *      2、在抽象的计算类基础上,实现了不同的计算方式,根据用户传入的计算方式,创建相应的实例并进行计算.
 * </pre>
 *
 * @since  2018年6月13日15:08:09
 * @author luliangwei
 * @version 0.0.1
 */
public class CalculationSimpleFactory {

    /**
     * 根据传入的计算方式,创建对应类的实例
     */
    public static Calculation getInstance(Formula formula) {

        switch (formula) {
        case ADD:
            return new Addition();
        case SUB:
            return new Subtraction();
        default:
            System.err.println("Bad formula"+ formula.name());
            break;
        }
        return null;
    }
}
