package cn.luliangwei.patterns.command;

/*
 * 模式中的调用者Invoker类，负责调用命令
 */
public class Waiter {

    private Command command;
    
    //设置命令
    public void setCommand(Command command) {
        this.command = command;
    }
    
    //调用命令
    public void invokeCommand() {
        command.execute();
    }
}
