/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/6 20:25
 */
//基本语法
//   【修饰符】 方法名（形参列表）{
//    方法体
//}


//构造器的修饰符可以默认
// 构造器没有返回值
//方法名 和 类名字 必须一样
//参数列表 和 成员方法 一样的规则
//构造器调用，由系统完成




//是类的一种特殊的方法，它的主要作用是完成对 新对象的初始化，他有几个特点
//1.方法名和类名一样
//2.没有返回值
//3.在创建对象时，系统会自动的调用该类的构造器完成对象的初始化


//构造是完成对象的初始化
public class Constructor {
    public static void main(String[] args) {
        Person p = new Person("luoshijie",20);//直接指定参数
        //这是第一个构造器
        System.out.println("p信息如下");
        System.out.println("p的对象名字="+p.name);
        System.out.println("p的对象年龄" + "="+p.age);

        Person p1 = new Person("nidei");//第二个构造器
        System.out.println("p1的信息="+p1.name);
    }
}


class Person{
    String name;
    int age;


    //构造器
    public Person(String pNane,int pAge){//构造器没有返回值
        //第一个构造器
//        方法名和类名一样

        System.out.println("构造器被调用");
        name = pNane;
        age = pAge;
    }

//构造器的重载
    public Person(String pName){
        //第二个构造器
        name = pName;

    }
}