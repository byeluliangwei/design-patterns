package cn.luliangwei.patterns.prototype;

import java.util.Date;

public class EducationExperience implements Cloneable{

    private String schoolName;
    private String degree;
    private Date graduateTime;

    public EducationExperience(String name, String degree, Date date) {
        this.schoolName = name;
        this.degree = degree;
        this.graduateTime = date;
    }
    
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(Date graduateTime) {
        this.graduateTime = graduateTime;
    }

}
