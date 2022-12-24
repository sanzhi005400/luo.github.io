package com.SchoolHome;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/4 20:39
 */
//1、实现一个名为Person的类和它的子类Employee，Manager是Employee的子类，
//        （1）Person类中的属性有：姓名（name，String），地址（address，String），定义该类的构造方法。
//        （2）Employee类中的属性有：工号（ID，String），工资（wage，double），工龄（workingyears，int），级别（level，String），定义该类的构造方法；
//        （3）Manager类中的属性有：部门（department，String），定义该类的构造方法；
//        （4）要求使用方法的重写（人，员工，经理类信息的输出方法）；要求实现类的构造方法（super关键字）
//        （5）编写一个测试类，产生一个员工和一个经理对象，输出员工和经理的基本信息；
//        （6）设计一个Add类用于涨工资，普通员工一次能涨10%，经理能涨20%。
//        （7）员工工龄超过3年的涨一次工资，部门经理工龄超过1年的涨一次工资。

class Person {
//    1）Person类中的属性有：姓名（name，String），地址（address，String），定义该类的构造方法。
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String print(){
        return "姓名是:"+getName()+" 地址是:"+getAddress();
    }


}
