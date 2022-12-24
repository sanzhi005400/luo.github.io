package com.hspedu.Poly_.detail.AnonymouslnnerClass;

/**
 * @author: 罗仕杰
 * @date: 2022/12/17 20:51
 * @description:
 */
/*匿名内部类的语法比较奇特，请大家注意，因为匿名内部类既是一个类的定义，
同时他本身也是一个对象，因此从语法上看，它既有定义类的特征，也有创建对象的特征
对前面代码分析可以看出这个特点，因此可以调用匿名内部类的方法*/
public class AnonymousInnerClassDetail {
    public static void main(String[] args){
        Outer05 outer05 = new Outer05();
        outer05.f1();
        //7.外部类成员-----不能访问-----》匿名内部类（匿名内部类用完就没了）
    }
}
class Person{//类
    public void hi(){
        System.out.println("Person里面的hi方法");
    }
}
class Outer05 {//外部类
    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类
        Person person = new Person() {//4.不能添加访问修饰符，因为它的地位就是一个局部变量
            //5.作用域：仅仅在定义它的方法或代码块中
            //6.匿名内部类-----访问-----》外部类成员[访问方式：直接访问]
            //8.如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，如果想要访问外部类的成员，则可以使用（外部类名.this.成员）去访问
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法"+n1);//3.可以直接访问外部类的所有成员，包含私有的
            }
        };
        person.hi();//动态绑定,真实的运行类型是Outer05$1

        //也可以直接调用,匿名内部类本身也是返回对象
//        new Person() {
//            @Override
//            public void hi() {
//                System.out.println("匿名内部类重写了 hi方法11111");
//            }
//        }.hi();
    }
}