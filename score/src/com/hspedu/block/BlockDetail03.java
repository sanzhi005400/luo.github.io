package com.hspedu.block;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 20:38
 * @description:
 */
/*5)构造方法(构造器)的最前面其实隐含了super()和调用普通代码块，
        新写一个类演示【截图+说明],静态相关的代码块，
        属性初始化，在类加载时，就执行完毕，因此是优先于构造器和普通代码块执行的*/
public class BlockDetail03 {
    public static void main(String[] args) {
        AAA aaa = new AAA();

    }
}
class BBB{
    public BBB(){
        System.out.println("BBB 的构造器被调用");
    }
}

class AAA extends BBB{
 public AAA(){
     //这里有几句隐藏的执行要求
     super();
     //1.调用super()
     //2.调用普通代码块
     System.out.println("AAA 的构造器被调用");
 }

    {
        System.out.println("AAA 的普通代码块被调用");
    }
}