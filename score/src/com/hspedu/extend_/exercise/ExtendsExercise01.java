package com.hspedu.extend_.exercise;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/20 15:54
 */
public class ExtendsExercise01 {

    public static void main(String[] args) {

        B b = new B();//a
    }
}

class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}

class B extends A{//每个子类的构造器第一行不是有默认的super（）不然就是this（），只能活一个

    B(){
        //因为有了this（），所以没有super（）了
        this("abc");
        System.out.println("b");
    }
    B(String name){
        //有一条默认的super构造器super（）
        System.out.println("b name");
    }
}