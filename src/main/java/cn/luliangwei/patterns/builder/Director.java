package cn.luliangwei.patterns.builder;
/*
 * 汽车厂老板将汽车组装任务交给工人
 */
public class Director {

    //工人组装汽车
    public void workers(Builder builder) {
        builder.buildEngine();
        builder.buildName();
        builder.buildWheels();
    }
}
