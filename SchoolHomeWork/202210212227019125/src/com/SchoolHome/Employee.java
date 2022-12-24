package com.SchoolHome;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/4 20:40
 */
class Employee extends Person{
//    （2）Employee类中的属性有：工号（ID，String），工资（wage，double），工龄（workingyears，int），级别（level，String），
//    定义该类的构造方法；
    private String ID;
    private double wage;
    private int workingyears;
    private String level;

    public Employee(String name, String address, String ID, double wage, int workingyears, String level) {
        super(name, address);
        this.ID = ID;
        this.wage = wage;
        this.workingyears = workingyears;
        this.level = level;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getWorkingyears() {
        return workingyears;
    }

    public void setWorkingyears(int workingyears) {
        this.workingyears = workingyears;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String print() {
        return super.print()+" 工号是:"+getID()+" 工资是:"+getWage()+
                " 工龄是:"+getWorkingyears()+" 级别是:"+getLevel();
    }
}
