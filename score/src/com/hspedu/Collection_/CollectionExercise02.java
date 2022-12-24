package com.hspedu.Collection_;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;;

/**
 * @author: 罗仕杰
 * @date: 2022/12/20 22:26
 * @description:
 */
public class CollectionExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List List = new ArrayList();
        List.add(new Cat("小花打的",20));
        List.add(new Cat("类是一样",2));
        List.add(new Cat("阿达瓦大",24));
        List.add(new Cat("爱我的ad",25));
        Iterator iterator = List.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator = List.iterator();
        System.out.println("========================第二次========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====增强for======");
        for(Object cat:List){
            System.out.println(cat);
        }
    }
}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}