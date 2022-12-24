package com.STUDENT;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/22 11:49
 */


class Student {
    String name;
    double score;
    static double SumScore;
    static double AverageScore;
    private static int count = 0;
    private static String CourseName = "《面向对象程序设计》";

    public Student() {
        count++;
    }

    public Student(String name, double score) {
        count++;
        this.name = name;
        this.score = score;
        SumScore += score;
    }

    public static double getSumScore(){
        return SumScore;
    }

    public static double getAverageScore(){
        return AverageScore = getSumScore() / count;
    }

    public static void PrintInfo(){
        System.out.println("总成绩:"+getSumScore()+"\n"+"平均成绩:"+getAverageScore());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
