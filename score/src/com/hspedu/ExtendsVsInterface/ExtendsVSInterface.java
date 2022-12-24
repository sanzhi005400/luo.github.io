package com.hspedu.ExtendsVsInterface;

import com.hspedu.modifier.B;

import java.awt.*;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 19:06
 * @description:
 */
/*当子类继承父类，就自动拥有父类的功能
* 如果子类需要扩展功能，可以通过实现接口的方式扩展
*
* 继承的价值主要在于:解决代码的复用性和可维护性
* 接口的价值主要在于:设计，设计好各种规范(方法)，让其他类去实现这些方法
*
* 接口在一定程度实现代码的解耦【主要依赖于接口的规范性和动态绑定机制】*/
public class ExtendsVSInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
    }
}
class Monkey{//猴子
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "猴子会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LittleMonkey extends Monkey implements FishAble,BirdAble {//继承

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习可以游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName()+"通过学习可以飞翔");
    }
}

//接口
interface FishAble{
    void swimming();
}
interface BirdAble{
    void flying();
}