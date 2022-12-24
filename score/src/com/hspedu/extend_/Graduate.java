package com.hspedu.extend_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/17 20:10
 */
//模拟大学生的考试的简单情况
public class Graduate {
    public String name;
    public int age;
    private double score;


    public void setScore(double score) {
        this.score = score;
    }


    public void testing(){//和pupil
        System.out.println("大学生"+ name+ "正在考大学数学...");
    }

    public void info(){
        System.out.println("大学生名字"+name+"年龄"+age+"成绩"+score);
    }
}
