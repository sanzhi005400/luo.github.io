package com.hspedu.override_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/21 20:14
 */
public class OverrideExercise {

    public static void main(String[] args) {
        Person person = new Person("罗仕杰","22");
        System.out.println(person.say());
        Student student = new Student("你爹","20",200000,90);
        System.out.println(student.say());
    }
}


class Person{
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String say(){
        return "我是"+getName()+"今年"+getAge()+"岁了";
    }
}

class Student extends Person{
    private int id;
    private double score;

    public Student() {
    }

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, String age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){//体现super的好处，代码复用

        return super.say()+"学号"+getId()+"成绩"+getScore();
    }
}