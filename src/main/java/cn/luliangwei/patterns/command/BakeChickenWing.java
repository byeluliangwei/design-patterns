package cn.luliangwei.patterns.command;

/**
 * 具体的命令
 * 
 * 这里是烤鸡翅命令
 */
public class BakeChickenWing extends Command{

    public BakeChickenWing(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.bbqer.bakeChickenWing();
    }

}
