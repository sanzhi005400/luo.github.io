package com.hspedu.Collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/12/18 14:40
 * @description:
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List List = new ArrayList();
        List.add(new Dog("小花",20));
        List.add(new Dog("打年",30));
        List.add(new Dog("大全",40));

        Iterator dogIt = List.iterator();
        while(dogIt.hasNext()){
            System.out.println(dogIt.next());
        }

        for(Object dog: List){
            System.out.println("dog="+dog);
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}