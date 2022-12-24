package com.Work01_;

/**
 * @author: 罗仕杰
 * @date: 2022/12/20 20:55
 * @description:
 */
public class Father {
    String name = "Father";
    int age = 45;

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    void setAge(int a) {
        age = a;
    }
}

class Child extends Father {
    String name = "Child";
    int age = 18;

    int getAge() {
        return age + 1;
    }
}

class Test2 {
    public static void main(String args[]) {
        Father p = new Child();
        System.out.println(p.getAge());
        p.setAge(30);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
