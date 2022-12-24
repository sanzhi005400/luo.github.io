package com.hspedu.super_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 17:30
 */
public class B extends A{
    //都有默认的无惨构造器
    public void hi(){// 1.访问父类的属性，但不能访问父类的private属性
//        System.out.println(super.n1+" "+super.n2+" "+super.n3+" "+super.n4);
        System.out.println(super.n1+" "+super.n2+" "+super.n3+" ");
    }
    public void ok(){//2.访问父类的方法，不能访问父类的private方法 super.方法名（参数列表）
        super.test100();
        super.test200();
        super.test300();
        //super.test400(); test400是私有的方法
    }
    //3.访问父类的构造器：super（参数列表）；只能放在构造器的第一句，只能是一句！
//    public void hello(){
//        super();
//    }错误的
    public B(){//只能放在构造器的第一句，只能是一句！
        //super();
        //super("jack",100);
        super("jack");
    }

    public void sun(){
        System.out.println("B类的sun()方法");
        //希望调用A类（父类）的cal方法
        //有三种方式可以调用
        //因为子类B没有cal（）方法
        cal();
        super.cal();
    }


}
