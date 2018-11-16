package cn.luliangwei.patterns.command;

/**
 * 烧烤店负责考的大哥
 * 
 * 就是命令模式中的Receiver，负责接收命令并且执行命令
 */
public class Barbecuer {

    public void bakeMutton() {
        System.out.println("烤羊肉串");
    }
    
    public void bakeChickenWing() {
        System.out.println("烤鸡翅");
    }
}
