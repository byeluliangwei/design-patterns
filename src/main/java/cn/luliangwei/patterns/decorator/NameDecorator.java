package cn.luliangwei.patterns.decorator;
/*
 * 车名称装饰器
 */
public class NameDecorator extends Decorator{

    private String name;
    
    public NameDecorator(String name) {
        super();
        this.name = name;
    }

    @Override
    public void show() {
        super.component.show();
        System.out.println("车名："+this.name);
    }
}
