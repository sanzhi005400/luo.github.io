package com.hspedu.extend_.ExtendsDetail;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 16:56
 */
//输入ctrl+H可以看到类的继承关系
    //7.Object类是所有类的基类(父类)
public class Sub extends Base{ //子类
    public Sub(String name,int age){//细节5.super()必须放在子类构造器的第一行 （先有爸再有儿子）,还有不能在成员方法中使用（和this一样）
        //1.老师想调用父类的无参构造器
        //super();//父类的无参构造器或者什么都不写（默认）super();
        //2.调用父类的Base(String name)构造器
        //super("我是你爹");
        //3.调用父类的Base(String name,int age)构造器
        //super("你爹",20);


        //6.super和this不能一起使用,因为两句话都得放在第一行
//        super();
//        this();
        System.out.println("子类的sub(String name,int age).....");

    }
    //继承父类
    public Sub(){
        //子类的构造器
        //有一句隐藏的super（）
        //super(); //默认调用父类的无惨构造器
        super("lsj",100);
        System.out.println("子类的sub().....");
    }

    public Sub(String name){
        //当创建子类对象的时候，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
        //do nothing......
        super("tom",100);
        System.out.println("子类的sub(String name).....");
    }
    public void sayOK(){//子类的方法
        //我们发现 父类的非private属性和方法都可以访问

        //非私有的属性和方法可以在子类直接访问
        //但是私有属性不能在子类直接访问

        //System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

        System.out.println(n1 + " " + n2 + " " + n3 + " " );


        test100();
        test200();
        test300();
        System.out.println("n4="+getN4());//要通过公共的方法去访问
        callTest400();

        //test400();因为是为private的方法
    }
}
