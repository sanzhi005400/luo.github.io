package com.hspedu.Final_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 22:52
 * @description:
 */
/*final使用细节和注意事项
* 1.final修饰的属性又叫做常量，一般用xx_xx_xx来命名
*
* 2.final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如下位置之一【选择一个位置即可】
         *一.定义时：如public final double TAX_RATE = 0.08;
         * 二.在构造器中
         * 三.在代码块中
         *
*3.如果final修饰的属性是静态的，则初始化的位置只能是
* 一.定义时
* 二.在静态代码块不能在构造器中赋值
*
* 4.final类不能继承，但是可以实例化对象【案例A2类】
*
* 5.如果类不是final类，但是含有final方法，则该方法虽然不能被重写，但可以被继承【案例A3类】*/

public class FinalDetail01 {
    public static void main(String[] args) {

    }
}

class A{
    /*一.定义时：如public final double TAX_RATE = 0.08;
     * 二.在构造器中
     * 三.在代码块中*/
    public final double TAX_RATE = 0.08;//定义时
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    //public final double TAX_RATE2; 不给值会报错，因为常量必须给值



    public A() {//构造器时
        TAX_RATE2 = 0.1;
    }

    {//代码块
        TAX_RATE3 = 8.8;
    }
}

class BB{
    /*3.如果final修饰的属性是静态的，则初始化的位置只能是
 * 一.定义时
 * 二.在静态代码块不能在构造器中赋值*/
    //public static final double TAX_RATE;//不初始化直接报错
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;
    //public static final double TAX_RATE3;//static不能在构造器中初始化

    static {
        TAX_RATE2 = 99;
    }

//    public BB(){
//        TAX_RATE3 = 88;
//    }
}