package com.hspedu.HomeWork_.HomeWork13;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/4 23:51
 */
//        (1)做一个Student类，Student类有名称(name)，性别(sex),年龄(age)，学号(stu_id)，做合理封装，通过构造器在创建对象时将4个属性赋值。
//        (2)写一个Teacher类，Teacher类有名称(name)，性别(sex)，年龄(age)，工龄(work_age),做合理封装，通过构造器在创建对象时将4个属性赋值。
//        (3)抽取一个父类Person类，将共同属性和方法放到Person类
//        (4)学生需要有学习的方法(study)，在方法里写生“我承诺，我会好好学习。”。
//        (5)教师需要有教学的方法(teach)，在方法里写上“我承诺，我会认真教学。”。
//        (6)学生和教师都有玩的方法(play)，学生玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回“xx爱玩足球”和“xx爱玩象棋”
//        (其中xx分别代表学生和老师的姓名)。因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重弓。
//        (7)定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序，)
//        定义方法，形参为Person类型，功能:调用学生的study或教师的
public class HomeWork13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("小明",'男',15,"2227019");
        person[1] = new Student("小年",'男',20,"0000300");
        person[2] = new Teacher("张飞",'男',30,5);
        person[3] = new Teacher("刘备",'男',35,10);

        person[0].apply(person[0]);
        person[0].apply(person[1]);
        person[0].apply(person[2]);
        person[0].apply(person[3]);

        System.out.println("==========排序前==========");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        Person temp;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length -1; j++) {
                if(person[j].getAge() < person[j+1].getAge()){
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }
        System.out.println("==============排序后============");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
class Person{
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void play(){
        System.out.println("爱玩");
    }

    public void apply(Person p){
        if(p instanceof Student){
            Student s = (Student) p;
            s.play();
        }
        if (p instanceof Teacher){
            Teacher t = (Teacher) p;
            t.play();
        }
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", sex=" + sex + ", age=" + age + '}';
    }
}

class Student extends Person{
    private String Stu_id;//学号

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        Stu_id = stu_id;
    }

    public String getStu_id() {
        return Stu_id;
    }

    public void setStu_id(String stu_id) {
        Stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public void play() {
        System.out.println(getName()+"爱玩足球");
    }

    @Override
    public String toString() {
        return "学生的信息:" + "姓名:" + getName() +"\n"
                + "年龄：" + getAge()+"\n"
                + "性别：" + getSex()+"\n"
                + "学号：" + getStu_id();
    }
}

class Teacher extends Person{
    private double work_age;//工龄

    public Teacher(String name, char sex, int age, double work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public double getWork_age() {
        return work_age;
    }

    public void setWork_age(double work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public void play() {
        System.out.println(getName()+"爱玩象棋");
    }

    @Override
    public String toString() {
        return "老师的信息:" + "姓名:" + getName() +"\n"
                + "年龄：" + getAge()+"\n"
                + "性别：" + getSex()+"\n"
                + "工龄：" + getWork_age();
    }


}