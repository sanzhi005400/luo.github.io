package com.hspedu.block;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 17:48
 * @description:
 */
public class BlockDetail02 {
    /*4)
    创建一个对象时，在一个类 调用顺序是:(重点，难点)
           1.调用静态代码块和静态属性初始化
            (注意:静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用)
            2.调用普通代码块和普通属性的初始化
            (注意: 普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
            3.调用构造方法新写一个类演示*/

    public static void main(String[] args) {
        A a = new A();
        //A.get();
        //System.out.println(A.n);

    }
}
class A{
    //静态属性初始化
    public static int n = get();
    public int age = getn1();

    {
        System.out.println("A 的普通代码块");
    }
    public static int get(){
        System.out.println("A 的get静态方法被调用");
        return 100;
    }

    public int getn1(){
        System.out.println("A 的getn1普通方法");
        return 200;
    }

    static {
        System.out.println("A 的静态代码块被调用");
    }
}