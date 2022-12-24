package com.hspedu.HomeWork_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/2 21:12
 */
//1.要求有属性“姓名name”，“年龄age”，"职称post","基本工资salary"
// 2.编写业务方法，introduce（），实现输出一个教师的信息。
// 3.编写教师类的三个子类：教授类.副教授类.讲师类,基本级别分别是：教授为1.3，副教授为1.2，讲师为1.1
// 在三个子类里面都重写父类的introduce（）方法
// 4.定义初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println("===========professor===============");
        Professor professor = new Professor("罗仕杰",20,"教授",3000,"1.3");
        System.out.println( professor.introduce());
        System.out.println("===========assProfessor===============");
        AssProfessor assProfessor = new AssProfessor("林老师",25,"副教授",20000,"1.2");
        System.out.println(assProfessor.introduce());
        System.out.println("===========Lecturer===============");
        Lecturer lecturer = new Lecturer("线老师",23,"讲师",10000,"1.1");
        System.out.println(lecturer.introduce());
        System.out.println("===========老师===============");
        Teacher teacher = new Teacher("宋老师",18,"老师",5000,"1");
        System.out.println(teacher.introduce());
    }
}

class Teacher{
    private String name;//名字
    private int age;//年龄
    private String post;//职称
    private double salary;//基本工资
    private String grade;//工资级别


    public Teacher(String name, int age, String post, double salary, String grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String introduce(){
        return toString();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                '}';
    }
}

class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, String grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return "Professor{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge()+
                ", post='" + super.getPost() + '\'' +
                ", salary=" + super.getSalary() +
                ", grade='" + super.getGrade() + '\'' +
                '}';
    }
}
class AssProfessor extends Teacher{
    public AssProfessor(String name, int age, String post, double salary, String grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return "AssProfessor{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge()+
                ", post='" + super.getPost() + '\'' +
                ", salary=" + super.getSalary() +
                ", grade='" + super.getGrade() + '\'' +
                '}';
    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, String grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return "Lecturer{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge()+
                ", post='" + super.getPost() + '\'' +
                ", salary=" + super.getSalary() +
                ", grade='" + super.getGrade() + '\'' +
                '}';
    }
}