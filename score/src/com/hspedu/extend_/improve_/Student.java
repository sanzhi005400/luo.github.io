package com.hspedu.extend_.improve_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 16:37
 */
//父类，是Pupil 和 Graduate的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }


    public void info(){
        System.out.println("学生名字"+name+"年龄"+age+"成绩"+score);
    }
}
