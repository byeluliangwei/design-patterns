package cn.luliangwei.patterns.proxy;
/**
 * 真实的主题，小明买手机
 */
public class BuyIphone implements Subject{

    private String name;
    
    @Override
    public void buyIphoneX() {
        System.out.println("真正需要买手机的人是："+ this.name);
    }

    
    public BuyIphone(String name) {
        super();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
