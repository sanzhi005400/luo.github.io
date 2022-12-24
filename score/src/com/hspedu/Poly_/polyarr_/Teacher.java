package com.hspedu.Poly_.polyarr_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 15:38
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public String say(){//重写父类的say方法
//        return getName() + "在说" + "年龄" + getAge() +"工资" + getSalary();
//    }


    @Override
    public String say() {
        return super.say() + "工资是" + getSalary();
    }

    public String teach(){
        return "老师"+getName()+"正在教书";
    }
}
