package com.hspedu.modifier;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/15 15:31
 */
public class B {
    //
    public void say(){
        A a = new A();
        //在同一个包下，可以访问public，protected和默认的属性或方法，不能访问私有的的属性或方法
        System.out.println("n1="+a.n1+"n2="+a.n2+"n3="+a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
