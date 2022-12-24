package com.hspedu.single_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 21:03
 * @description:
 */
/*什么是设计模式
1。静态方法和属性的经典使用
2.设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格以及解决问题的思考方式 。
设计模式就像是经典的棋谱，不同的棋局，我们用不同的棋谱，免去我们自己再思考和摸索*/

/*什么是单例模式
单例(单个的实例)
1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法
2.单例模式有两种方式:1)饿汉式 2)懒汉式*/
public class SingleTon01 {
    //单例模式应用实例演示饿汉式和懒汉式单例模式的实现步骤如下:
    //1) 构造器私有化 =>>防止直接new对象
    //2)类的内部创建对象
    //3)向外暴露一个静态的公共方法。getlnstance
    //4)代码实现
    public static void main(String[] args) {
        /*这是可以创建多个对象*/
        /*如果构造器私有化的话，会报错*/
//        GirlFriend girlFriend = new GirlFriend("小红");
//        GirlFriend girlFriend1 = new GirlFriend("小黄");

        //通过方法可以调用到对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}


/*有一个GirlFriend类
* 也就是只能有一个女朋友*/
class GirlFriend{
    private String name;

    //为了能够在静态方法中返回gf对象，需要将成员变量设置为静态的
    private static GirlFriend girlFriend = new GirlFriend("小花");//只要创建就存在非常着急
    //如何保证只创建一个对象
    /*
    单例模式--->[饿汉式]
    1.将构造器私有化
    2.在类内部直接创建（静态的）
    3.提供一个公共的静态方法,返回gf对象
    */
    //对象通常是重量级对象，饿汉式可能造成创建了对象，但没有使用
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "名字是"+name;
    }
}