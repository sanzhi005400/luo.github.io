/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/11 20:12
 */
//创建一个Employee类，属性有（名字，性别，年龄，职位，薪水）提供三个构造方法，可以初始化（1）（名字，性别，年龄，职位，薪水）
    //2（名字，性别，年龄）  3（职位，薪水）要求充分利用构造器
public class HomeWork10 {
    public static void main(String[] args) {
        Employee staff = new Employee("罗仕杰",'男',21,"高级工程师",20000);
        System.out.println(staff.name+"\t"+staff.sex+"\t"+staff.age+"\t"+staff.position+"\t"+staff.salary);


    }
}

class Employee{
    String name;
    char sex;
    int age;
    String position;
    double salary;





    public Employee(String position,double salary){
        this.position = position;
        this.salary = salary;
    }


    public Employee(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    //我写的
//    public Employee(String name,char sex,int age,String position,double salary){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.position = position;
//        this.salary = salary;
//    }

    public Employee(String name,char sex,int age,String position,double salary){
        this(name,sex,age);
        this.position = position;
        this.salary = salary;
    }
}