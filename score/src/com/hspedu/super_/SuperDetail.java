package com.hspedu.super_;

import com.hspedu.extend_.ExtendsDetail.Sub;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 17:40
 */
//super给程序带来的便利和细节
    //1.调用父类的构造器的好处（分工明确，父类属性由父类初始化，子类的属性由子类初始化）
    //2.当子类中有和父类的成员（属性和方法）重名时，为了访问父类的成员，必须通过super。如果没有重名，使用super和this直接访问是一样的效果
public class SuperDetail {

    public static void main(String[] args) {
        System.out.println("=====第一个对象=========");
        Sub b = new Sub();//子类必须调用父类的构造器，完成父类的初始化

        System.out.println("=====第二个对象=========");
//当创建子类对象的时候，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
// 如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器完成对父类的初始化工作
// 否则编译不会通过

        //8.父类构造器的调用不限于直接父类！将一直追溯直到Object类（定级父类）

        //9.子类最多只能有继承一个父类（指直接继承）,即java是单继承机制
        //如何让A类继承b类和c类

        //10.不能滥用继承，子类和父类必须满足is-a的逻辑关系
        //Person is a Music 不合理

        //Animal
        //Cat extends Animal  合理
        Sub sub = new Sub("你爹");

        System.out.println("=====第三个对象=========");
        Sub sub1 = new Sub("罗仕杰",20);

    }
}
