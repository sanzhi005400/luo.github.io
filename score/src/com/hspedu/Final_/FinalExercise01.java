package com.hspedu.Final_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 23:16
 * @description:
 */
public class FinalExercise01 {
     /*请编写一个程序，能计算圆形的面积，要求圆周率为3.14.赋值的位置3个方法都写一下*/
}
class Circle{
    private double radius;
    private static final double PI = 3.14;
    private  final double PI1;
    private  static final double PI2;

    public Circle(double radius){
        this.radius = radius;
        PI1 = 3.14;
    }

    {
        //PI=3.14;
    }

    static {
        PI2 = 3.14;
    }

    public double Cal(){
        return radius*radius*PI;
    }
}