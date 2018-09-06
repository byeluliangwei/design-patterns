package cn.luliangwei.patterns.decorator;
/*
 * 座位装饰器
 */
public class SeatDecorator extends Decorator{

    private int seats;
    
    
    public SeatDecorator(int seats) {
        super();
        this.seats = seats;
    }

    @Override
    public void show() {
        this.component.show();
        System.out.println("座位："+this.seats+"座");
    }
}
