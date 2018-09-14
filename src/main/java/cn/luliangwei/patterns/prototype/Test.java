package cn.luliangwei.patterns.prototype;

import java.util.Date;


public class Test {

    public static void main(String[] args) {
        //这种clone是深拷贝，因为edu这两个对象都不一样了
        ProtoTypeResume resumeA = new ProtoTypeResume("llw","man",24);
        EducationExperience edu = new EducationExperience("沈阳理工大学", "学士", new Date());
        resumeA.setEducation(edu);
        
        ProtoTypeResume resumeB = (ProtoTypeResume) resumeA.clone();
        EducationExperience edu2 = new EducationExperience("西南科技大学", "硕士", new Date());
        resumeB.setEducation(edu2);
        resumeA.show();
        resumeB.show();
        
        System.out.println("------------------------------------------");
        //这种是浅拷贝，resumeC只包含了resumeA中基本属性，引用属性没有被复制，指向的是同一个地址
        ProtoTypeResume resumeC = (ProtoTypeResume) resumeA.clone();
        edu.setDegree("硕士");
        edu.setGraduateTime(new Date());
        edu.setSchoolName("西南科技大学");
        resumeC.setName("pual");
        resumeA.show();
        resumeC.show();
        
        System.out.println("------------------------------------------");
        //EducationExperience实现cloneable接口后，改变原来的clone方法
        ProtoTypeResume resumeD = (ProtoTypeResume) resumeA.clone();
        edu.setDegree("硕士");
        edu.setGraduateTime(new Date());
        edu.setSchoolName("西南科技大学");
        resumeC.setName("answer");
        resumeD.show();
        resumeA.show();
    }
}
