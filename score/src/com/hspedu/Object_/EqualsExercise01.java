package com.hspedu.Object_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/31 19:21
 */
//应用实例：判断两个Person对象的内容是否相等，
//如果两个Person对象的各个属性值都一样，则返回true，反之false
public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("罗仕杰",20,'男');
        Person person1 = new Person("罗仕杰",20,'男');

        person.equals(person1);
        System.out.println(person.equals(person1));
    }
}



class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //重写Object的equals方法(我写的)
//    public boolean equals(Person p){
//        if(super.equals(p)){
//            return true;
//        }
//        if(this.name.equals(p.name)){
//            if(this.age == p.age){
//                if(this.gender == p.gender){
//                    return true;
//                }return false;
//            }return false;
//        }return false;
//    }

    //老师写的
    public boolean equals(Object obj){
        //判断如果两个对象是同一个对象，返回true
        if(this == obj){
            return true;
        }
        //类型判断
        if(obj instanceof Person){//是Person类我们才比较

            //进行类型转换（向下转型）,因为我需要得到obj的各个属性
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
            }
        return false;
        }
    }
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

