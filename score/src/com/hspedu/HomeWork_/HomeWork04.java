package com.hspedu.HomeWork_;

import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/3 10:59
 */
//通过继承核算员工工资打印功能
// 父类：员工类
// 子类：部门经理类和普通员工类
// （1）部门经理的工资 = 1000+单日工资*天数*等级（1.2）
// （2）普通员工类工资 = 单日工资*天数*等级（1.0）
// （3）员工属性；姓名，单日工资，工作天数
// （4）员工方法：打印工资
public class HomeWork04 {
    public static void main(String[] args) {
        employee employee = new employee("罗仕杰",200,10);
        DepManager depManager = new DepManager("林嘉豪",300,20);
        System.out.println(employee.PrinfSalary());
        System.out.println(depManager.getAlonSalary());
    }
}
class Staff {
    private String name;
    private double AlonSalary;
    private double DayNum;


    public Staff(String name, double alonSalary, double dayNum) {
        this.name = name;
        AlonSalary = alonSalary;
        DayNum = dayNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlonSalary() {
        return AlonSalary;
    }

    public void setAlonSalary(double alonSalary) {
        AlonSalary = alonSalary;
    }

    public double getDayNum() {
        return DayNum;
    }

    public void setDayNum(double dayNum) {
        DayNum = dayNum;
    }

    public double PrinfSalary() {
        return getAlonSalary()*getDayNum();
     }
}
class DepManager extends Staff{
    public DepManager(String name, double alonSalary, double dayNum) {
        super(name, alonSalary, dayNum);
    }


    public double PrinfSalary() {
        return super.PrinfSalary()*1.2+1000;
    }
}
class employee extends Staff{
    public employee(String name, double alonSalary, double dayNum) {
        super(name, alonSalary, dayNum);
    }
    public double PrinfSalary() {
        return super.PrinfSalary()*1.0;
    }


}