package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 14:47
 * @description:
 */
public class Interface02 {
     /*接口就是给出一些没有实现的方法，封装到一起，到某个类要使用的时候，在根据具体情况吧这些方法写出来
    语法：
    * interface 接口名{
    *  //属性
    *  //方法
    * }
    *
    * class 类名 implements 接口{
            自己的属性；
            自己的方法；
            必须要实现的接口的抽象方法
    }*/
    //jdk8后的接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现
     public static void main(String[] args) {

     }
}

class A implements USB{
     //想要实现必须将该接口的所有抽象方法都重写
     @Override
     public void hi() {

     }
}