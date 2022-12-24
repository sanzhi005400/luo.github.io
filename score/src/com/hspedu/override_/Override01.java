package com.hspedu.override_;

import com.hspedu.super_.A;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/21 19:35
 */
//方法覆盖（重写）就是子类有一个方法，和父类的某个方法的名称，返回类型，参数一致，那么我们称子类的方法覆盖了父类的方法
    //子类和父类不一定是单级的关系可能是爷爷类或者祖宗类
public class Override01 {

    public static void main(String[] args) {
        //演示方法重写的情况
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("动物叫唤。");
    }

    public Object m1(){//和子类的String方法构成重写
        return null;
    }
}


class Dog extends Animal{
    //因为Dog是Animal的子类，
    //Dog的cry方法与Animal的cry定义的形式一样(名称，返回类型，参数)
    //这时我们就说Dog的cry方法，重写了父类Animal的cry方法
   public void cry(){
       System.out.println("小狗汪汪汪。。。。");
   }

   public String m1(){
       return null;
   }
}