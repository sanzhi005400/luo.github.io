package com.hspedu.InterfacePolyParameter;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 19:21
 * @description:
 */
/*1)多态参数(前面案例体现)
* 在前面的USB接口案例，USB usb，既可以接收手机对象，又可以接收相机对象，就体现了接口多态(接口引用可以指向实现了接口的类的对象)
*/
public class InterfacePolyParameter {
    public static void main(String[] args) {

        //接口的多态体现
        //接口类型的变量 if01 可以指向 实现了IA接口的对象实例
        IA if01 = new Monster();
        IA if02 = new Car();
    }
}

interface IA{}
class Monster implements IA{}
class Car implements  IA{}