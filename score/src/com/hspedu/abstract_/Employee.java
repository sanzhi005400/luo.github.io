package com.hspedu.abstract_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 13:48
 * @description:
 */
abstract class Employee {
    private String name;
    private double id;
    private double salary;

    public Employee(String name, double id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public  abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(getName() + "经理" + "工作中");
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, double id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"工作中");
    }
}

class Test{
    public static void main(String[] args) {
        Manager manager = new Manager("jack",999,20000,5000);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee("jack",999,20000);
        commonEmployee.work();
    }
}