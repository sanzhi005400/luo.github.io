package com.hspedu.Poly_.PolyTest;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/26 15:36
 */
public class Master {
    private String name;
    //=========================属性========================
    public Master(String name) {
        this.name = name;
    }
    //=========================构造器========================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //=========================设置器========================


    //使用多态机制可以统一的管理主人喂食物的问题
    //animal是编译类型，可以指向（接受）Anamal子类的对象
    //food是编译类型，可以指向（接受）Food子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人"+name+"给"+animal.getName()+"喂"+food.getName());
    }


    //主人完成对小狗喂食(没用多态前的代码)
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人"+name+"给"+"小狗"+dog.getName()+"喂"+bone.getName());
//    }
//
//    //主人完成对小猫喂食
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人"+name+"给"+"小猫"+cat.getName()+"喂"+fish.getName());
//    }
    //如果动物很多，食物很多，那么feed方法会很多，那么代码重复性很高。
    //那么多态就来了，解决代码的复用性，和利于维护
}
