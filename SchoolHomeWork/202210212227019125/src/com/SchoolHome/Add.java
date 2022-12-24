package com.SchoolHome;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/4 20:50
 */
class Add{


    //        （6）设计一个Add类用于涨工资，普通员工一次能涨10%，经理能涨20%。
    //        （7）员工工龄超过3年的涨一次工资，部门经理工龄超过1年的涨一次工资。
    public double RiseSalary(Employee e){
        if(e.getWorkingyears() > 3){
            int x = e.getWorkingyears()/3;
            for (int i = 0; i < x; i++) {
                e.setWage(e.getWage() * 1.1);
            }return e.getWage();
        }
        return e.getWage();
    }
    public double RiseSalary(Manager m){
        if(m.getWorkingyears() > 1){
            int x = m.getWorkingyears()/1;
            for (int i = 0; i < x; i++) {
                m.setWage(m.getWage() * 1.2);
            }return m.getWage();

        }
        return m.getWage();
    }


}
