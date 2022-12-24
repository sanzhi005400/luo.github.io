package com.hspedu.HomeWork_.HomeWork05;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/3 16:49
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack",20000);
        System.out.println(worker.printInfo());;

    }
}

class employee{
    private String name;
    private double salary;

    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double printInfo(){
        return getSalary()*12;
    }
}

class Worker extends employee{//工人


    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double printInfo() {
        return super.printInfo();
    }
}

class Peasant extends employee{//农民


    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double printInfo() {
        return super.printInfo();
    }
}

class Teacher extends employee{//教师

    private double ScSalary;//课酬

    public Teacher(String name, double salary, double scSalary) {
        super(name, salary);
        ScSalary = scSalary;
    }

    public double getScSalary() {
        return ScSalary;
    }

    public void setScSalary(double scSalary) {
        ScSalary = scSalary;
    }

    @Override
    public double printInfo() {
        return super.printInfo()+getScSalary();
    }
}

class Scientist extends employee{//科学家

    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double printInfo() {
        return super.printInfo()+getBonus();
    }
}

class Waiter extends employee{//服务生


    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double printInfo() {
        return super.printInfo();
    }
}

//Test
//Demo
//Rose
//jack
//
//jion
//jack