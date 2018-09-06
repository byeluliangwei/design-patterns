package cn.luliangwei.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * This project is for learn design patterns!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My design patterns !" );
        System.out.println("free mem : " + Runtime.getRuntime().freeMemory()/1024/1024 + "M");
        System.out.println("total mem : " + Runtime.getRuntime().totalMemory()/1024/1024 + "M");
        System.out.println("max mem : " + Runtime.getRuntime().maxMemory()/1024/1024 + "M");
        List<Byte[]> list=new ArrayList<Byte[]>();
        for(int i=0;i<100;i++){
            //构造1M大小的byte数值
            Byte[] bytes=new Byte[1024*1024];
            //将byte数组添加到list列表中，因为存在引用关系所以bytes数组不会被GC回收
            list.add(bytes);
        }
    }
}
