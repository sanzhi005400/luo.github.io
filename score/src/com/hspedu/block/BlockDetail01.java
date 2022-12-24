package com.hspedu.block;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 17:34
 * @description:
 */
public class BlockDetail01 {
    /*代码块使用注意事项和细节讨论

    1)static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，并且只会执行一次。
    如果是普通代码块， 每创建一个对象，就执行。

    2)类什么时候被加载
     创建对象实例时(new)
     创建子类对象实例，父类也会被加载
     使用类的静态成员时(静态属性，静态方法)
     案例演示:A类extends B类 的静态块

    3)普通的代码块，在创建对象实例时，会被隐式的调用。
    被创建一次，就会调用一次
    如果只是使用类的静态成员时，普通代码块并不会执行

    4) 创建一个对象时，在一个类 调用顺序是:(重点，难点)
    1.调用静态代码块和静态属性初始化
    (注意:静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用)

    2.调用普通代码块和普通属性的初始化
    (注意: 普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)

    3.调用构造方法新写一个类演示*/


    public static void main(String[] args) {
        //创建对象实例时(new)
        AA aa1 = new AA();
        System.out.println("=================");
        //创建子类对象实例，父类也会被加载
        BB aa = new AA();
        System.out.println("=================");
        //使用类的静态成员时(静态属性，静态方法)
        System.out.println(Cat.age);

    }
}

class Cat{
    //静态属性
    public static int age = 1000;

    static {
        System.out.println("Cat 的静态代码块被调用");
    }
}
class BB{
    //静态代码快
    static {
        System.out.println("BB 的静态代码块被调用");
    }

    {
        System.out.println("BB 的普通代码块被调用");
    }
}
class AA extends BB{
    //静态代码块
    static {
        System.out.println("AA 的静态代码块被调用");
    }

    {
        System.out.println("AA 的普通代码块被调用");
    }
}