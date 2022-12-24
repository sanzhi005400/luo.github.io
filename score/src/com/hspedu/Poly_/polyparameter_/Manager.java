package com.hspedu.Poly_.polyparameter_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 16:54
 */
public class Manager extends Employee{
    //普通员工和经理继承了员工类，经理类多了奖金bonus属性和管理manage方法
    private double bonus;

    public Manager(String name,double salary,double bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理 "+getName()+" 正在管理。。。。");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
