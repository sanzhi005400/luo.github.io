package com.hspedu.Final_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 22:37
 * @description:
 */
/*基本介绍
* final中文意思是最后的，最终的
* final可以修饰类，属性，方法和局部变量
* 在某些情况下，程序员可能有一下需求，就会使用到final
* 1.当不希望类被继承时候，可以使用final修饰
*
* 2.当不希望父类的某个方法被子类覆盖/重写时（override）时,可以使用final关键字修饰
* [案例演示：访问修饰符final 返回类型 方法名]
*
* 3.当不希望类的某个属性的值被修改，可以用final修饰
* [public final double TAX_RATE = 0.08]
*
* 4.当不希望某个局部变量被修改，可以使用final修饰
* [final double TAX_RATE = 0.08]*/
public class Final01 {
    public static void main(String[] args) {
        //E e = new E();
        //e.TAX_RATE = 0.9;常量不能修改
    }
}
//如果我们要求A类不能被其他类继承
// 可以使用final修饰A类
//final class A{}
//class B extends A{}

//class C{
//    //如果我们要求hi方法可以被继承不能被重写
//    // 可以使用final修饰hi()方法
//    public final void hi(){}
//}

//class D extends C{
//    @Override
//    public void hi() {
//       System.out.println("重写C类的hi()方法");
//    }
//}

class E{
    public final double TAX_RATE = 0.08;//这个值是可以修改的
}

class F{
    public void cry(){
        /*这时候NUM也称为局部常量*/
        final double NUM = 0.01;
       //NUM = 0.9;局部变量不允许修改咯
        System.out.println("NUM = "+NUM);
    }
}