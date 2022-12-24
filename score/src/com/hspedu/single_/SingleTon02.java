package com.hspedu.single_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 22:09
 * @description:
 */
/*
* 懒汉式的单例模式
* */

    /*饿汉式VS懒汉式
1.二者最主要的区别在于创建对象的时机不同: 饿汉式是在类加载就创建了对象实例而懒汉式是在使用时才创建
2.饿汉式不存在线程问题，懒汉式存在线程安全问题。(后面学习线程后，会完善)
3.饿汉式存在浪费资源的可能。因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题
4.在我们iavaSE标准类中，java.lang.Runtime就是经典的单例模式*/
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        //再次调用
        System.out.println(instance);
    }
}

//希望在程序运行的过程中，只能创建一个Cat对象
//使用单例模式
class Cat{
    private String name;
    private static Cat cat;//2

    //步骤
    //1.任然将构造器私有化
    //2.定义一个静态属性对象
    //3.提供一个公共的静态方法，返回一个Cat对象
    //4.懒汉式，只有当用户调用getInstant的时候，才返回cat对象，当后面再次调用时，会返回上次创建的cat对象，
    // 从而保证了单例
    private Cat(String name) {//1
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance(){
        if(cat == null){//如果还没有创建猫
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}