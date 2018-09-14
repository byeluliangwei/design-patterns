package cn.luliangwei.patterns.prototype;


/**
 * 原型模式（ProtoType）
 * 
 * <pre>
 * 原理：
 *      用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象
 *      原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节
 * 结构：     
 *      Clinet：让一个原型克隆自身从而创建一个新的对象
 *      ProtoType：原型类，声明一个克隆自身的接口
 *      ConcretePrototype:具体的原型类，实现一个克隆自身的操作
 *  
 * 使用场景：
 *      一般在初始化的信息不发生改变的情况下，克隆是最好的办法，隐藏了对象创建了细节，又不用每次执行构造函数，提升了性能；
 *      
 *  浅复制：
 *      被复制对象的所有变量都含有与原来的对象相同的值，但是对于原来对象中的引用,复制后对其他对象的引用仍然指向原来的对象。
 *      实现cloneable接口，重写clone()方法即可
 *  
 *  深复制：
 *      把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。
 *      按照本例中的实现即可
 *      
 *  其实深复制，就是需要复制对象内部引用的对象，也要实现Cloneable
 *      
 * 注意：在Java中，不用我们自己写一个原型类,直接实现Java自带的Clonable,然后重写clone()方法
 * 
 * </pre>
 * 
 */
public class ProtoTypeResume implements Cloneable {
    private String name;
    private String sex;
    private int age;
    public EducationExperience education;

    public ProtoTypeResume(String name ,String sex ,int age) {
        this.name = name;
        this.sex = sex ;
        this.age = age;
    }
    
    //实现深拷贝,提供clone方法调用的私有构造函数，以克隆教育经历
    private ProtoTypeResume(EducationExperience education) {
        this.education = (EducationExperience) education.clone();
    }
    
    
    @Override
    public Object clone() {
        ProtoTypeResume resume = null;
        resume = new ProtoTypeResume(this.education);
        
        resume.age = this.age;
        resume.name = this.name;
        resume.sex = this.sex;
        return resume;
    }
    
    public void show() {
        System.out.println("===============基本信息====================");
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("===============教育经历====================");
        System.out.println("学校：" + this.education.getSchoolName());
        System.out.println("学位：" + this.education.getDegree());
        System.out.println("毕业时间：" + this.education.getGraduateTime());
        System.out.println();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EducationExperience getEducation() {
        return education;
    }

    public void setEducation(EducationExperience education) {
        this.education = education;
    }
    
}
