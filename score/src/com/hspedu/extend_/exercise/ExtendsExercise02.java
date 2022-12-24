package com.hspedu.extend_.exercise;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/20 16:04
 */
public class ExtendsExercise02 {

    public static void main(String[] args) {
        C01 c01 = new C01();
    }
}
//我是A类，
//hahah 我是b类的有参构造器
//我是c类的有参构造器
//我是c类的无参构造器

class A01{
    public A01(){
        System.out.println("我是A类");
    }
}

class B01 extends A01{
    public B01(){
        System.out.println("我是B类的无参构造器");
    }

    public B01(String name){
        //默认的super（）
        System.out.println(name+"我是B类的有参构造器");
    }
}

class C01 extends B01{
    public C01(){
        this("hello");
        System.out.println("我是c类的无参构造器");
    }
    public C01(String name){
        super("hahah");
        System.out.println("我是c类的有参构造器");
    }
}
