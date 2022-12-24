package com.hspedu.extend_.ExtendsThory;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 20:58
 */
//继承的本质
    //分析当子类继承父类，创建子类对象时，内存中到底发生了什么
    //老师提示：当子类对象创建好后，建立查找关系
public class ExtendsTheory {

    public static void main(String[] args) {
        Son son = new Son();//内存到底发生了什么(内存的布局)

        System.out.println(son.name);//输出了哪个name？ 这时注意要按照查找关系返回信息
        //1.首先看子类是否有该属性
        //2.如果子类有这个属性，并且可以访问，则返回信息
        //3.如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，就返回信息）
        //4.如果父类没有，就按照（3.）规则继续寻找上级父类，直到Object，如果都没有就报错

        System.out.println(son.getAge());//我想返回age,返回的是39,如果是私有的属性，会继承但不能访问
        System.out.println(son.hobby);//继承了



    }
}
class GrandPa{//
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa{//父类
    String name = "大头爸爸";
    private int age = 39;//如果是私有属性，就可以通过父类提供公共方法调用

    public int getAge(){
        return age;
    }
}

class Son extends Father{//子类
    String name = "大头儿子";
}