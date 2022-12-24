package com.hspedu.Interface_.interfaceDetail;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 16:19
 * @description:
 */
public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
    }
}
interface A{
    int a = 23;//等价public static final int a = 23;//final属性不能被继承和修改
}

class B implements A{

}