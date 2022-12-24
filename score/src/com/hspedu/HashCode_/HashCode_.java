package com.hspedu.HashCode_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/1 19:17
 */
//1.提高具有哈希结构的容器效率
    //2.两个引用，如果指向同一个对象，则哈希值肯定一样的
    //3.两个引用，如果指向的是不同对象，则哈希值是不一样的（不绝对）
    //4.哈希值主要根据地址号来的！不能完全将哈希值等价为地址
    //5.java语言是跑在虚拟机上的，拿不到内部地址
    //6.后面在集合中，hashcode如果需要的话，也会重写(讲集合的时候再说)
public class HashCode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        //2.两个引用，如果指向同一个对象，则哈希值肯定一样的
        //3.两个引用，如果指向的是不同对象，则哈希值是不一样的（不绝对）
        System.out.println("aa的hashcode"+aa.hashCode());
        System.out.println("aa2的hashcode"+aa2.hashCode());
        System.out.println("aa3的hashcode"+aa3.hashCode());

    }
}

class AA{}
