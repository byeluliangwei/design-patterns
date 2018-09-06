package cn.luliangwei.patterns.simplefactory;

/**
 * 算式枚举，包含 + - * /
 */
public enum Formula {

    ADD("加法"),
    SUB("减法"),
    MUL("乘法"),
    DIV("除法");
    
    private String description;

    
    
    private Formula(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
