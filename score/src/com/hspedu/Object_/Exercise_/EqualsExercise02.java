package com.hspedu.Object_.Exercise_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/31 20:49
 */
public class EqualsExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hspedu";

        Person p2 = new Person();
        p2.name = "hspedu";

        System.out.println(p1==p2);//false ==比较引用类型的话是比较是否同一个对象
        System.out.println(p1.name.equals(p2.name));//true 判断的是String类型，已经重写了所以是String的方法，判断字符串是否相等
        System.out.println(p1.equals(p2));//false equals没有重写所以是Object里的equals方法，比较的是两个对象是否同一个，地址是否相等

        String s1 = new String("asdf");

        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));//true 调用了String的equals方法，判断字符串是否相等
        System.out.println(s1==s2);//false ==判断引用类型是判断是否相同的对象
    }
}

class Person{
    public String name;
}