/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 17:18
 */
//1.this关键字可以用来访问本类的属性，方法，构造器
//2.this用于区分当前类的属性和局部变量
//3.访问成员方法的语法；this.方法名（参数列表）；
//4.访问构造器的语法；this（参数列表）：注意只能在构造器中使用(即只能在构造器中访问另一个构造器)
//5.this不能在类定义的外部使用，只能在类定义的方法中使用

public class ThisDetail {
    public static void main(String[] args) {
//        T t1 = new T();
//        t1.f2();
        T t2 = new T();

        t2.f3();
    }
}

class T{

    String name = "Jack";
    int age = 100;


    //4.访问构造器的语法；this（参数列表）：注意只能在构造器中使用(即只能在构造器中访问另一个构造器)
    public T(){
        //希望调用到T(String name,int age)这个构造器
        this("罗仕杰",20);//如果调用构造器，必须放置第一句话
        System.out.println("T()被调用");


    }

    public  T(String name,int age){
        System.out.println("T(String name,int age)被调用");
    }


    //3.访问成员方法的语法；this.方法名（参数列表）；
    public void f1(){
        System.out.println("f1()方法");
    }

    public  void f2(){
        System.out.println("f2()方法");

        //想要调用本类的f1方法
        f1();
        //第一种方式

        this.f1();
        //第二种方式
    }

    public void f3(){
        String name ="shimiy";
        System.out.println("name"+name+"age"+age);//传统方式
        System.out.println("name"+this.name+"age"+this.age);//也可以通过this访问属性
    }
}