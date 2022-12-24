package com.hspedu.Final_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 23:05
 * @description:
 */
/*5.一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法了

* 6.final不能修饰构造方法(即构造器)

* 7.final和static往往搭配使用，效率更高,底层编译器做了优化处理(不会导致类的加载)
* [案例]
* 8.包装类(Integer，Double，Float,Boolean等都是final)，String也是final类
* */
public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);//注意，类里面的静态属性时先加载再运行，先加载num=10000，再加载静态代码块，在静态代码块里面输出，然后再回去运行BBB。num
    }
}

final class AAA{//如果类是final类了，方法就不用再加final，因为final不能被继承
    public final void cry(){}
}

class BBB{
    //.final和static往往搭配使用，效率更高,底层编译器做了优化处理(不会导致类的加载)
    public final static int num = 10000;//如果不加final，再被调用的时候就会加载静态代码块
    static {
        System.out.println("BBB 静态代码块被执行");
    }

}