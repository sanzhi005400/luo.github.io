package com.hspedu.Poly_.polyparameter_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 16:40
 */
public class Employee {
    //定义一个员工类Employee,包含姓名和月工资【private】，以及计算年工资getAnnual的方法
    private String name;
    private double MonSalary;

    public Employee(String name, double salary) {
        this.name = name;
        this.MonSalary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonSalary() {
        return MonSalary;
    }

    public void setMonSalary(double MonSalary) {
        this.MonSalary = MonSalary;
    }

    public double getAnnual(){
        return 12 * getMonSalary();
    }
}
