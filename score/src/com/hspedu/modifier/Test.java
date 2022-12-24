package com.hspedu.modifier;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/15 15:30
 */
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1();

        B b = new B();
        b.say();
    }
}
//只有默认和public可以 修饰类
class tiger{}