package com.hspedu.Poly_.polyparameter_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 16:46
 */
public class Worker extends Employee{
    // 普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法.
    public Worker(String name,double salary){
        super(name,salary);
    }

    public void work(){
        System.out.println("普通员工 "+getName()+" 正在工作中。。。。");
    }

    @Override
    public double getAnnual(){
        return super.getAnnual();
    }
}
