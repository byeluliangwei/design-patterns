package cn.luliangwei.patterns.command;

/**
 * 一天一个设计模式之----命令模式（Command）
 *
 * Invoker:调用者，负责调用命令。
 * Receiver:接收者，负责接收命令并且执行命令。
 * Command:是一个抽象类，类中对需要执行的命令进行声明，一般来说要对外公布一个execute方法用来执行命令。
 * ConcreteCommand:Command类的实现类，对抽象类中声明的方法进行实现。代表具体的命令
 *
 */
public class Client {
    public static void main(String[] args) {
        
     // 接受者收到命令并执行命令
        Barbecuer receiver = new Barbecuer();

        // 具体的命令
        Command bakeMutton = new BakeMuttonCommand(receiver);
        Command bakeChicken = new BakeChickenWing(receiver);

        // 调用命令者
        Waiter waiter = new Waiter();
        waiter.setCommand(bakeMutton);
        waiter.invokeCommand();
        
        waiter.setCommand(bakeChicken);
        waiter.invokeCommand();
    }

}
