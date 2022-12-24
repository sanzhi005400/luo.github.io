package com.hspedu.Poly_.polyparameter_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 16:35
 */
//多态参数方法定义的形参类型为父类类型，实参类型允许为子类类型

//定义一个员工类Employee,包含姓名和月工资【private】，以及计算年工资getAnnual的方法
//普通员工和经理继承了员工类，经理类多了奖金bonus属性和管理manage方法,
// 普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法.
// 测试类中添加一个方法showEmpAnnal（Employee e），实现获取员工对象的年工资，并在main方法中调用该方法【e.getAnnual()】
// 测试类中添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理则调用manage方法
public class PloyParameter {

    public static void main(String[] args) {
        Worker worker = new Worker("你爹", 20000);
        Manager manager = new Manager("你儿子",400000,5000);


        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnal(worker);
        ployParameter.showEmpAnnal(manager);
        ployParameter.testWork(worker);
        ployParameter.testWork(manager);
    }

    // 测试类中添加一个方法showEmpAnnal（Employee e），实现获取员工对象的年工资，并在main方法中调用该方法【e.getAnnual()】
    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual());
    }
    // 测试类中添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理则调用manage方法
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            System.out.println(((Worker)e).getAnnual());
        } else if (e instanceof Manager) {
            System.out.println(((Manager)e).getAnnual());
        } else {
            System.out.println("类型错误，请检查");
        }
    }
}
