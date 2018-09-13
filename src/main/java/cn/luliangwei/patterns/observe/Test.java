package cn.luliangwei.patterns.observe;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 一天一个设计模式之----观察者模式
 * <pre>
 * 原理：
 *      观察者定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象状态发生变化时，会通知所有观察者对象，使它们能够更新自己
 *      
 * 结构：
 *  Subject：抽象的主题对象，将所有的观察者对象保存在一个聚集里，每个主题可以有任意数量的观察者。抽象主题具有增加和删除观察者的接口
 *  Observer：抽象的观察者，为所有观察者定义一个接口，的到主题的变化时，对这个变化进行相应处理
 *  ConcreteSubject：具体的被观察对象，本例中我改为了发布者，当这个主题发生变化，立刻通知所有关注它的观察者
 *  ConcreteObserver：具体的观察者，收到主题的变化时，修改自身的状态
 * </pre>
 */
public class Test {

    public static void main(String[] args) {
        
        String s = "aaacccxxAAABBCCC";
        
        System.out.println(charCount(s));
        Publisher publisher = new Publisher();
        
        ConcreteObserver1 ob1 = new ConcreteObserver1("zhangsan");
        ConcreteObserver2 ob2 = new ConcreteObserver2("lisi");
        
        publisher.addObserver(ob1);
        publisher.addObserver(ob2);
        publisher.setPublisheMessage("地震了！！！！！！");
        publisher.notification();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //=====================================================================================================
    //                                                  分割线
    //=====================================================================================================
    
    
    public static Map<String, Integer> charCount(String str){
        Map<String, Integer> map = new HashMap<>();
        int[] chars = new int[52];
        for(char ch : str.toCharArray()) {
            if(ch >= 97 && ch <= 122) {
              //小写字母
                chars[ch-97]++;
            }else if(ch >= 65 && ch <= 90){
                //大写字母
                chars[ch-65+26]++;
            }
        }
        for(int i = 0 ; i< chars.length ; i++) {
            if(i>=0 && i <26 && chars[i] != 0) {
                map.put(String.valueOf((char)(i + 97)), chars[i]);
            }else if(i>=26 && i <52 && chars[i] != 0){
                map.put(String.valueOf((char)(i + 65)), chars[i]);
            }
        }
        return map;
    }
    
    
    
    
    
    
    
    
    //------------------------------以下是之前做的一些笔试题，暂时放在这吧--------------------------------------
    public static String reverse1(String str) {
        if(str == null || str.equals("")) return "";
        String s = reverse2(str);
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = array.length-1;i>=0;i--) {
            if(i>0) {
                sb.append(array[i]).append(" ");
            }else {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }
    
    public static String reverse2(String s) {
        int len = s.length();
        String result = "";
        for(int i = 0 ; i< len;i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }
    
    //-------------------------------------------------------------
    public static String multiple(String str1,String str2) {
        BigDecimal a = new BigDecimal(str1);
        BigDecimal b = new BigDecimal(str2);
        BigDecimal result = a.multiply(b);
        return result.toString();
    }
    
    //---------------------------------------------------------------
    public static String findLastChar(String str) {
        
        if(str == null || str.equals("")) return "NULL";
        char[] chars = str.toCharArray();
        HashMap<String, Integer> charCount = new HashMap<>();
        for(int i = 0 ; i< chars.length ; i++) {
            String key = String.valueOf(chars[i]);
            if(!charCount.containsKey(key)) {
                charCount.put(key, 1);
            }else {
                charCount.put(key, charCount.get(key) + 1);
            }
        }
        String result = "";
        
        for(Entry<String, Integer> entry : charCount.entrySet()) {
            if(entry.getValue() == 1) {
                result += entry.getKey();
            }
        }
        if(result.equals("")) return "NULL";
        
        return String.valueOf(result.charAt(result.length()-1));
    }
    
    //-----------------------------
    public static String reverse(String str) {
        
        if(str == null || str.equals("")) return "";
        String result = "";
        String[] array = str.split(" ");
        for(int i = 0 ; i< array.length ;i++) {
            array[i] = reverseSubStr(array[i]);
            if(i<array.length-1) {
                result += array[i]+ " ";
            }else {
                result += array[i];
            }
        }
        return result;
    }
    
    public static String reverseSubStr(String str) {
        if(str == null || str.equals("")) return "";
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = chars.length-1 ; i >= 0 ; i--) {
            sb.append(String.valueOf(chars[i]));
        }
        return sb.toString();
    }
    
}
