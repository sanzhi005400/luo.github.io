package com.hspedu.InnerClass;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 20:35
 * @description:
 */
/*基本介绍
* 一个类的内部又完整的嵌套了另一个类结构。
*被嵌套的类称为内部类（inner class），嵌套其他类的类称为外部类（outer class）.是我们类的第五大成员
* 类的成员有哪一些
* 内部类最大的特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系*/
    //基本语法
    //class Outer{//外部类
//       class Inner{  内部类
//       }
// }
//    class Other{ //外部其他类
// }
public class InnerClass {
    public static void main(String[] args) {
    }
}
class Outer{//外部类
    private int n1 = 100;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }

    public void m1(){
        class fuck{
            public void fuck(){System.out.println("m1的方法");}
        }
    }//方法

    {
        System.out.println("代码块");
    }//代码块
    class Inner{//内部类

        /*内部类的分类
        * 定义在外部类局部位置上（比如方法内）
        * 1）局部内部类(有类名)
        * 2)匿名内部类(没有类名，重点)
        *
        * 定义在外部类的成员位置上
        * 1）成员内部类(没用static修饰)
        * 2)静态内部类(使用static修饰)*/
    }
}