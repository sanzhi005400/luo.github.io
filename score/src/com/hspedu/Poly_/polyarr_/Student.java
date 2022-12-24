package com.hspedu.Poly_.polyarr_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 15:38
 */

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

//    public String say(){//重写父类的方法
//        return getName() + "在说" + "年龄" + getAge() +"成绩" + getScore();
//    }


    @Override
    public String say() {
        return super.say() + "成绩是" + getScore();
    }
    public String study(){
        return "学生" + getName()+"在学习";
    }
}
