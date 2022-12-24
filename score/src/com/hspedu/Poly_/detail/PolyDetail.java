package com.hspedu.Poly_.detail;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/27 20:47
 */
//多态的前提是：两个对象（类）存在继承关系
// 多态的向上转型
// 1.本质；父类的引用指向了子类的对象
// 2.语法：父类的类型  引用名 = new 子类类型（）；
// 3.特点；编译类型看左边，运行类型看右边。可以调用父类中的所有成员（需遵守访问权限），
// 4.不能调用子类中特有的成员，最终运行效果看子类的具体实现
public class PolyDetail {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类的对象
        Animal animal = new Cat();
        System.out.println(animal.name);;
        //Object cat1 = new Cat();//是可以的 Object是所有类的父类
        //cat1.catchMouse();
        // 这个不能调用，因为在编译阶段，能调用哪些成员（包含属性和方法）是由编译类型来决定的（catchMouse()是Cat运行类型的方法）


//        animal.eat();
//        animal.run();
//        animal.show();
//        animal.sleep();

        //多态的向下转型
        // 1.语法：子类类型  引用名 = （子类类型）父类引用
        // 2.只能强转父类的引用，不能强转父类的对象
        // 3.要求父类的引用必须指向的是当前目标类型的对象
        // 4.当向下转型时，可以调用子类类型中所有的成员

        //我希望可以调用catchMouse()方法
        //向下转型
        //（1）语法：子类类型  引用名 = （子类类型）父类引用
        //一个小问题，cat的编译类型是什么：Cat 运行类型是？：Cat
//        Cat cat = (Cat) animal;
//        cat.catchMouse();
        //（2）要求父类的引用必须指向的是当前目标类型的对象
        //意思就是animal原先new的时候必须指向Cat的对象

//        Dog dog = (Dog) animal;//这样是不可能编译成功，引用不能引用到别的类



    }
}

class Animal{
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("hello world");
    }
}

class Cat extends Animal{
     String name = "猫";
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void swimming(){
        System.out.println("狗游泳");
    }
}