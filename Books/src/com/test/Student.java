package com.test;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/22 10:59
 */
//1、计算指定个数的员工的应发工资和实发工资。（其中应发工资=月基本工资+奖金+补贴，实发工资=应发工资-个人所得税）
//        要求：
//        （1）输入员工个数
//        （2）输入每个员工的姓名、性别、月基本工资（salary）、月奖金(bonus)、月补贴(subsidt)。
//        （3）根据以上输入数据，计算并输出每个员工的应发工资(wagesPayable)和实发工资(netSalary)。
//        个税收取情况：
//        ①超过3500元收取5%税率；如（wagesPayable-3500）*0.05
//        ②超过5000元低于7500元的在原基础之上额外收取7.5%税率。
//        如（wagesPayable-5000）*0.075+（5000-3500）*0.05
//        ③超过7500元低于13000元的在原基础之上额外收取12%税率。
//        ④超过13000元的在原基础之上额外收取20%税率。


import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入员工个数");//输入员工个数
        int staffNum = myScanner.nextInt();

        for (int i = 0; i < staffNum; i++) {
            System.out.println("请输入员工姓名");
            String name = myScanner.next();
            System.out.println("请输入员工性别");
            char sex = myScanner.next().charAt(0);
            System.out.println("请输入员工基本工资");
            int salary = myScanner.nextInt();
            System.out.println("请输入员工月奖金");
            double bonus = myScanner.nextDouble();
            System.out.println("请输入月补贴");
            double subsidt = myScanner.nextDouble();
            double wagesPayable = salary + bonus + subsidt;//实发工资
            System.out.println("应发发工资="+wagesPayable);
            if(wagesPayable <= 3500 ){
                double netSalary = wagesPayable - (wagesPayable-3500)* 0.05;
                System.out.println("实发工资等于="+netSalary);
            }else if(wagesPayable >= 5000 && wagesPayable <= 7000){
                double netSalary = wagesPayable - ((wagesPayable-5000)*0.075+(5000-3500)*0.05);
                System.out.println("实发工资等于="+netSalary);
            }else if(wagesPayable >= 7500 && wagesPayable <= 13000){
                double netSalary = wagesPayable - ((wagesPayable-7500)*0.12+(wagesPayable-5000)*0.075+(5000-3500)*0.05);
                System.out.println("实发工资等于="+netSalary);
            }else if(wagesPayable >= 13000){
                double netSalary = wagesPayable - ((wagesPayable-13000)*0.20+(wagesPayable-7500)*0.12+(wagesPayable-5000)*0.075+(5000-3500)*0.05);
            }

        }


//        应发工资=月基本工资+奖金+补贴
//        实发工资=应发工资-个人所得税
//        ①超过3500元收取5%税率；如（wagesPayable-3500）*0.05
//       ②超过5000元低于7500元的在原基础之上额外收取7.5%税率。
//      如（wagesPayable-5000）*0.075+（5000-3500）*0.05
//      ③超过7500元低于13000元的在原基础之上额外收取12%税率。
//        ④超过13000元的在原基础之上额外收取20%税率。




    }
}
