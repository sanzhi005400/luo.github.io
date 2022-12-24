package com.SchoolHome;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/4 20:50
 */
public class Test {
    //        （5）编写一个测试类，产生一个员工和一个经理对象，输出员工和经理的基本信息；
    public static void main(String[] args) {
        Employee employee = new Employee("jack","登龙路99号","2222000",20000,10,"高级职称");
        Manager manager = new Manager("玛丽莎","南安","3330000",20000,10,"中级职称","设计部");
        System.out.println(employee.print());
        System.out.println(manager.print());
        System.out.println("============涨工资后的测试============");
        Add add = new Add();
        System.out.println(add.RiseSalary(employee));
        System.out.println(add.RiseSalary(manager));

    }
}
