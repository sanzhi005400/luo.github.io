package com.SchoolHome;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/4 20:42
 */
class Manager extends Employee{
//    （3）Manager类中的属性有：部门（department，String），定义该类的构造方法；
    private String department;

    public Manager(String name, String address, String ID, double wage, int workingyears, String level, String department) {
        super(name, address, ID, wage, workingyears, level);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String print() {
        return super.print()+" 部门是："+getDepartment();
    }
}
