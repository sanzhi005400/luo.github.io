package com.hspedu.InnerClass;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 20:48
 * @description:
 */
/*说明：局部内部类是定义在外部类的局部位置，比如方法中，并且有类名
* 1.可以直接访问外部类的所有成员，包含私有的
* 2.不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能使用修饰符的。但是可以使用final修饰，因为局部变量也可以使用final
* 3.作用域：仅仅在定义它的方法或代码块中
* 4.局部内部类————访问————》外部类的成员【访问方式：直接访问】
* 5.外部类———访问————》局部内部类的成员
* 6.外部类在方法中可以创建内部类的实例，然后调用方法
* 7.外部其他类---不能访问----》局部内部类(因为 局部内部类地位是一个局部变量)
* 8.如果外部类和局部内部类的成员重名时，默认遵守就近原则，如果想要访问外部类的成员，则可以使用(外部类名.this.成员)去访问
* 访问方式：创建对象，再访问(注意：必须在作用域中)*/

    //记住：（1）局部内部类是定义在方法中或代码块中。（2）作用域在方法体或者代码块中（3）本质任然是个类
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.say();
    }
}
class Outer03{//外部类
    private int n1 = 10;
    private static String NAME = "张三";
    private void say02(){
        System.out.println("外部类的say02方法");
    }//私有方法


    /*局部内部类是定义在外部类的局部位置，比如方法中，并且有类名*/
    //通常是在方法中
    public void say(){
        int n3 = 30;
        class LocalInnerClass01{//相当于一个局部变量(本质任然是一个类)
            //1.可以直接访问外部类的所有成员，包含私有的
            int n2 = 40;
            //8.如果外部类和局部内部类的成员重名时，默认遵守就近原则，
            // 如果想要访问外部类的成员，则可以使用(外部类名.this.成员)去访问
            private int n1 = 800;
            public void show(){
                say02();
                System.out.println("n1= "+Outer03.this.n1+"外部类");
                System.out.println("n1= "+n1+"内部类");
            }
        }

        //6.外部类在方法中可以创建内部类的实例，然后调用方法
        LocalInnerClass01 localInnerClass01 = new LocalInnerClass01();
        localInnerClass01.show();
    }



}