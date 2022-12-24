package com.hspedu.Poly_.PolyTest;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/26 16:25
 */
public class PolyMethod {
    //方法重载体验多态
    public static void main(String[] args) {
        A a = new A();
        //我们通过不同的参数个数去调用sum方法，就会去调用不同的方法。
        //因此对sum方法来说，就是多种状态的体现
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10,20,30));

        //方法的重写也体现了多态
        B b = new B();
        a.say();
        b.say();


    }
}

class B{
    public void say(){
        System.out.println("B say（）方法被调用。。。。");
    }
}
class A extends B{
    public int sum(int n1,int n2){
        return n1+n2;
    }

    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("A say（） 方法被调用。。。。");
    }
}