package com.hspedu.extend_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/17 20:07
 */
//模拟小学生考试的情况
public class Pupil {
    public String name;
    public int age;
    private double score;



    public void setScore(double score) {

        this.score = score;
    }

    public void testing(){

        System.out.println("小学生"+ name+ "正在考小学数学...");
    }

    public void info(){

        System.out.println("小学生名字"+name+"年龄"+age+"成绩"+score);
    }
}
