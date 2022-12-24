package com.hspedu.Finalize_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/1 19:42
 */
//1.当对象被回收时，系统自动调用该对象的finalize方法，子类可以重写该方法，做一些释放资源的操作
    //2.什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象是一个垃圾对象，就是使用垃圾回收机制来销毁该对象，在销毁该对象钱，会先调用finalize方法
    //3.垃圾回收机制的调用，是由系统来决定，也可以通过System.gc()主动触发垃圾回收机制，测试：Car【name】
public class Finalize_ {
}
