package com.hspedu.Interface_;

public interface USB {
    //写属性
    public int n1 = 10;
    //写方法
    //在接口中，抽象方法可以省略abstract关键字
    public void hi();

    //jdk8后的接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现（需要使用default关键字修饰）
    default void ok(){
        System.out.println("ok....");
    }

    //静态方法
    public static void ok1(){
        System.out.println("1111111");
    }
}
