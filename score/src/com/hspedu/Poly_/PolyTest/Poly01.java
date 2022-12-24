package com.hspedu.Poly_.PolyTest;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/26 15:35
 */
//通俗来讲:1.多态融合了重写和重载的特点的结合体
        //2.多态有重载的形参列表不同的特点
        //3.多态有重写的继承类可访问的特点
public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("小明");
        Dog dog = new Dog("哈巴狗");
        Bone bone = new Bone("大棒骨");
        master.feed(dog,bone);

        System.out.println("=================================");
        Cat cat = new Cat("狸花猫");
        Fish fish = new Fish("花鱼");
        master.feed(cat,fish);

        System.out.println("=================================");
        Food food = new Bone("小骨头");
        Animal animal = new Dog("大狗蛋");
        master.feed(animal,food);

        System.out.println("=================================");
        //添加给小猪喂米饭
        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("米饭");
        master.feed(pig,rice);
    }
}
