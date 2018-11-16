package cn.luliangwei.patterns.command;

/**
 * 抽象的命令类
 * 声明命令执行操作的接口，一般会包含一个execute方法
 * 
 * @author luliangwei
 * @since 2018年11月16日20:03:27
 */
public abstract class Command {

    protected Barbecuer bbqer;
    
    public Command(Barbecuer receiver) {
        this.bbqer = receiver;
    }
    
    //执行命令
    public abstract void execute();
}
