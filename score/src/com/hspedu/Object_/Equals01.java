package com.hspedu.Object_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 18:32
 */
//两个等号和equals的对比【面试题】
// ==是一个比较运算符
//1.==：既可以判断基本类型，又可以判断引用类型
//2.==：如果判断基本类型，判断的是值是否相等。例：int i=10；double d=10.0
//3.==：如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象

//4.equals:是Object类中的方法，只能判断引用类型，如何查看jdk源码
//5.默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如integer，String【看看String 和 integer的equals的源代码】

public class Equals01 {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);
        B bObject = a;
        System.out.println(bObject == c);

        //equals 方法，源代码怎么查看。 File-->Project Structure --> SDKs -->Sourcepath
        //光标放在该方法上，ctrl+b
        //
        "hello".equals("abc");
    }
}
class B{

}
class A extends B{

}