package com.hspedu.InterfacePolyParameter;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 19:25
 * @description:
 */
/*3)接口存在多态 传递现象*/
    /*演示多态传递现象*/
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        //如果IG继承IH接口，而我们Teacher类实现了IG的接口
        //实际上相当于Teacher 类也实现了IH接口
        IH ih = new Teacher(); //Teeacher并没有实现IH
    }
}
interface IH{}
interface IG extends IH{}
class Teacher implements IG{

}