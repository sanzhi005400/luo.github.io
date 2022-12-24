package com.hspedu.Interface_.interfaceDetail;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 16:02
 * @description:
 */
public class InterfaceDetail02 {
    /*5)一个类同时可以实现多个接口【举例】
    * 6)接口中的属性，只能是final的，而且是public static final修饰符.比如：
    * int a = 1;实际上是 public static final int a = 1;(必须初始化)
    * 7）接口中属性的访问形式：接口名.属性名
    * 8)一个接口不能继承其他的类，但是可以集成多个别的接口[举例]
    * 9)接口的修饰符 只能是public 和默认，这点和类的修饰符是一样的*/
}
interface IA {//8)一个接口不能继承其他的类，但是可以集成多个别的接口[举例]
    int N1 = 100;//等价于 public static final int n1 = 100;
   void ahi();
}

interface IB{
    void bhi();
}

interface IC extends IA,IB{}

class Pig implements IB,IA{//5)一个类同时可以实现多个接口【举例】
    @Override
    public void ahi() {

    }

    @Override
    public void bhi() {

    }
}