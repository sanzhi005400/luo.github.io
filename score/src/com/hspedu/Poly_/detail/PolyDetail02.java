package com.hspedu.Poly_.detail;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/28 19:49
 */
//1.属性没有重写之说，属性的值看编译类型

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();//向上转型
        System.out.println(base.count);//会等于10，因为属性没有重写，值的内容看编译类型
        System.out.println("===================");
        Sub sub = new Sub();
        System.out.println(sub.count);//会等于20，因为属性没有重写，值的内容看编译类型
    }
}


class Base{//父类
    int count = 10;//属性
}

//属性没有重写之说，属性的值看编译类型


class Sub extends Base{//子类
    int count = 20;//属性
}