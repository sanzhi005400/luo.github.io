package com.hspedu.HomeWork_;

import java.util.Arrays;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/2 20:33
 */
//定义一个Person类{name,age,job},初始化Person对象数组，有三个Person对象，并按照age从大到小进行排序，
// 提示，使用冒泡排序
public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",40,"老师");
        person[1] = new Person("smith",30,"家长");
        person[2] = new Person("mick",10,"学生");
        System.out.println("=================排序前=====================");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

        Person person1 = new Person();
        person1.sort(person);

        System.out.println("=================排序后=====================");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

    }

}


class Person{
    private String name;
    private int age;
    private String job;

    public Person(){
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public  void sort(Person[] person){
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1; j++) {

                if(person[j].age > person[j+1].age){
                    Person temp;
                    temp = person[j+1];
                    person[j+1] = person[j];
                    person[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}