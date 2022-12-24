package com.hspedu.Poly_.objpoly;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/26 19:07
 */
//对象的多态
    //1.一个对象的编译类型和运行类型可以不一致
    //2.编译类型在定义对象时，就确认了，不能改变
    //3.运行类型是可以变化的
    //4.编译类型看定义时 = 号左边，运行类型看 = 号的右边
public class PolyObject {
    public static void main(String[] args) {


        //体验对象多态的特点
        Animal animal = new Dog();//Animal是编译类型，且编译类型确定了
        //而Dog是dog的运行类型，可以改变
        //animal = new Cat();
        animal.cry();//这时执行到该行时，animal运行类型是Dog

        System.out.println("=========================");

        animal = new Cat();
        animal.cry();//该行时运行类型指向了Cat
    }
}
