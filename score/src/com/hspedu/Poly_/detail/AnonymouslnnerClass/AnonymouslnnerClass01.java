package com.hspedu.Poly_.detail.AnonymouslnnerClass;

/**
 * @author: 罗仕杰
 * @date: 2022/11/22 23:44
 * @description:
 */
/*匿名内部类的使用(重要)
（1）本质是一个类（2）内部类（3）该类没名字（4）同时还是一个对象
*
* 说明：匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名
* 1.基本语法
* new 类或接口(参数列表){
*     类体
* }*/
public class AnonymouslnnerClass01 {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.TigerMethod();
        outer04.DogMethod();
    }
}
class Outer04{//外部类
    private int n1 = 20;
    public void TigerMethod(){
        //基于接口的匿名内部类
        //如果实现一个IA接口传统方法就是(需求就是使用IA接口并创建对象)：写一个类，实现该接口，并创建对象
        //3.我不想创建tiger或dog类，只想使用一次，我们可以使用匿名内部类简化开发
//        IA aa = new AA();
//        aa.cry();
        //4.tiger的编译类型是什么? IA
        //5.tiger的运行类型是什么? 就是匿名内部类xxx => 外部类的名字Outer04$1
        /*
        * 我们看底层
        * class xxx implements IA(){
        * @Override
//    public void cry() {
//        System.out.println(" xxx");
        * }
        * */
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫。。。。");
            }
        };
        System.out.println("tiger的运行类型"+tiger.getClass().getName());
        tiger.cry();
    }
    public void DogMethod(){
        IA Dog = new IA(){
            @Override
            public void cry() {
                System.out.println("小狗叫....");
            }
        };
        Dog.cry();

        //演示基于类的匿名内部类
        //1.father的编译类型 Father
        //2.father运行类型 Outer04$3
        //3.底层会创建匿名内部类
        //4.同时也直接返回了 匿名内部类Outer02$2的对象
        //5.Father("jack")参数列表会传递给构造器
        /*
        * class Outer02$3 extends Father{}
        * */
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("重写了test方法");
            }
        };
        System.out.println(father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        //必须实现抽象方法
        Animal dog = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
    }
}

interface IA{
    public void cry();
}
//class tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println(" 老虎叫");
//    }
//}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("狗叫唤");
//    }
//}
class Father{
    public Father(String name){
        //构造器
    }
    public void test(){
        //方法
    }
}
abstract class Animal{
    abstract void eat();
}