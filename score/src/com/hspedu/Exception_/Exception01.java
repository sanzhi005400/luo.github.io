package com.hspedu.Exception_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/27 16:04
 * @description:
 */
/*异常基本概念
* java语言中，该程序执行中发生的不正常情况称为“异常”，（开发过程中的语法错误和逻辑错误不是异常）
* Throwable执行过程中所发生的异常事件可分为两类
* (1)Error(错误)，java虚拟机无法解决的严重问题，如：JVM系统内部错误，资源耗尽等严重情况，比如StackOverflowError[栈溢出]和OOM（out of memory）,
* Error是严重的错误，程序会崩溃
*(OutOfMemoryError and StackOverflowError)
* （2）Exception：其他因编程错误或者偶然的外在因素导致的一般性问题，可以使用针对性代码进行处理，例如空指针访问，视图读取不存在的文件，网络连接中断等等，
* Exception分为两大类，运行时异常[程序运行时，发生的异常]和编译时异常[编程时，编译器检测出来的异常]
* RuntimeException下面的体系图
* NullPointException ArithmeticException ArrayIndexOutOfBoundsException ClassCastException NumberFormatException*/

    /**/
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //除数为0
        //系统会抛出异常，提示ArithmeticException：/by zero
        //当抛出异常以后，程序就崩溃了，下面的代码啊就不会继续运行
        //这样的程序好嘛？
        //将来软件是个庞大的工程量，程序的健壮性就会很差（不算致命的问题就会崩溃）
        //java设计者提供了一个异常处理机制来解决该问题
        //解决方案叫做异常捕获
        //如果程序员，认为一段代码可能出现异常/问题，可以使用异常处理机制来解决，从而来保证我们程序的健壮性
        //快捷键，将代码块选中，ctrl+alt+t
        try {
            int res = num1/num2;
        } catch (Exception e) {
            System.out.println("出现异常的原因"+e.getMessage());//输出异常的信息
        }
        System.out.println("程序继续运行");
    }
}
