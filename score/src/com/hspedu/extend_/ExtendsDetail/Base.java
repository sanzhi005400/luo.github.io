package com.hspedu.extend_.ExtendsDetail;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 16:53
 */
public class Base extends TopBase{//父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    //===============================属性================================

    public Base(){//父类的无参构造器
        System.out.println("父类的base().....");
    }
    public Base(String name,int age) {//有参构造器
        System.out.println("父类的有参base(String name，int age).....");
    }

    public Base(String name){//有参构造器
        System.out.println("父类的有参base(String name).....");
        // 如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器完成对父类的初始化工作
// 否则编译不会通过

    }
    //===============================构造器================================

    public int getN4(){//父类提供一个public的方法
        return n4;
    }
    public void callTest400(){//父类提供一个public的方法
        test400();
    }
    //===============================公共方法调用私有方法和属性赋值================================
    public void test100(){
        System.out.println("test100");
    }
    public void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
}
