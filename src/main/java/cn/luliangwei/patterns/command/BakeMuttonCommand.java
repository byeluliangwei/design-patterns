package cn.luliangwei.patterns.command;

/**
 * 具体的命令
 * 
 * 这里就是具体的烤羊肉串的命令
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        bbqer.bakeMutton();
    }
    
    
}
