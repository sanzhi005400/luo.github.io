package com.hspedu.Poly_.dynamic_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/28 20:24
 */
//java的动态绑定机制（非常重要）
    //1.当调用对象方法的时候，【该方法会和该对象的（内存地址/运行类型）绑定】
    //2.当调用对象属性时，【没有动态绑定机制，哪里声明哪里使用】
public class DynamicBinding {
    public static void main(String[] args) {
        //a的编译类型是A，运行类型是B
        A a = new B();
        System.out.println(a.sum());//? 40  当子类的sum被注销以后？---》 30
        System.out.println(a.sum1());//? 30  当子类的sum1被注销以后？---》 20

    }
}

