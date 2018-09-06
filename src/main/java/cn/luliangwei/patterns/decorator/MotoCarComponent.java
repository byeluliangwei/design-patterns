package cn.luliangwei.patterns.decorator;

/*
 * 摩托车
 * 具体的车component
 */
public class MotoCarComponent extends CarComponent{

    @Override
    public void show() {
        System.out.println("------摩托车组装-----");
        super.show();
    }

}
