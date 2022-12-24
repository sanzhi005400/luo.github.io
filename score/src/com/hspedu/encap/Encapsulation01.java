package com.hspedu.encap;

import java.util.Scanner;
//1.封装
//2.封装的方法set和get
//3.构造器和set方法的嵌套使用
/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/17 18:04
 */
public class Encapsulation01 {
            //主类
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("jackdddddddd");
//        person.setAge(30333333);
//        person.setSalary(30000);
//        System.out.println(person.info());
//
//        System.out.println(person.getSalary());//添加权限判断

        //如果我们直接使用构造器指定属性,构造器就会绕过private保护机制直接赋值
        Person person1 = new Person("jack",2022222,200000);
        System.out.println("=======jack的信息========");
        System.out.println(person1.info());

    }
}


class Person{
    //不能直接修改private=============================================================================
    public String name;
    private int age;//私有化
    private double salary;//私有化
    private String job;//私有化

    //自己写太慢了
//    public void setAge(int age){
//        if(age >= 1 && age <= 120){
//            this.age = age;
//        }
//    }
//
//    public void setName(String name){
//        int length = name.length();
//        if(length >= 2 && length <= 6){
//            this.name = name;
//        }
//    }
//    public String getName(){
//
//    }
    //快捷键 alt + insert

    //提供个构造器=============================================================================
    public Person() {//无惨构造器

    }




    public Person(String name, int age, double salary) {//带三个属性的构造器
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //===============================传统的构造器



        //如果想要构造器和保护同时生效，我们可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //=============================================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        int length = name.length();
        if (length >= 2 && length <= 6){
            this.name = name;
        }else {
            System.out.println("名字长度需要在2-6之间(默认名字无名)");
            this.name = "无名";
        }
    }
    //名字=============================================================================

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120 ){
            this.age = age;
        }else {
            System.out.println("你设置的年龄不对，需要在1-120（默认年龄18）");
            this.age = 18;//给一个默认年龄
        }
    }
    //年龄=============================================================================

    public double getSalary() {
        //增加对向前对象的权限判断
        System.out.println("请输入管理员密码查看工资");
        Scanner myScanner = new Scanner(System.in);
        String p1 = myScanner.next();
        if(p1.equals("Lovezl00")){
            return salary;
        }else {
            System.out.println("密码错误,请重新输入");
            return 0;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //工资=============================================================================

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    //职位=============================================================================



    //写一个方法，返回属性信息=============================================================================
    public String info(){
        return "信息为:nane=" + name +"\t" + "age=" + age +"\t"+ "薪水=" + salary;
    }
}