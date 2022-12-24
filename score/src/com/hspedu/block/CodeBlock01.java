package com.hspedu.block;

import java.util.SplittableRandom;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 17:12
 * @description:
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好李焕英");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;


    /*三个构造器的重载
    因为以下三个构造去哦器都有重复的语句，
    我们就可以将其提取重复的部分，
    放入代码块中，提高代码的重用性
    这样不管我们调用哪一个构造器，创建对象，都会优先调用我们的代码块*/
    public Movie(String name) {
//        System.out.println("电影开场");
//        System.out.println("电影广告");
//        System.out.println("电影正式开始");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影开场");
//        System.out.println("电影广告");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影开场");
//        System.out.println("电影广告");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }

     /*代码块的好处和案例演示
1)相当于另外一种形式的构造器(对构造器的补充机制)，可以做初始化的操作
2)如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的重用性
3)代码块的快速入门
*/
    static {
         System.out.println("电影开场");
         System.out.println("电影广告");
         System.out.println("电影正式开始");
     }
}