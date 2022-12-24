package com.hspedu.single_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 22:26
 * @description:
 */
class sing_ {//饿汉式
    private String name;
    private int age;
    public static double price = 1000;
    private static sing_ sing = new sing_("罗仕杰",22);

    private sing_(String name, int age) {
        System.out.println("sing构造器被调用");
        this.name = name;
        this.age = age;
    }

    public static sing_ getSing(){
        return sing;
    }

    @Override
    public String toString() {
        return "sing_{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AA{//懒汉式
    private String name;
    private int age;
    public static double price = 1000;
    static AA aa;

    private AA(String name, int age) {
        System.out.println("AA构造器被调用");
        this.name = name;
        this.age = age;
    }

    public static AA getAa(){
        if(aa == null){
            aa = new AA("你爹",20);
        }
        return aa;
    }

    @Override
    public String toString() {
        return "AA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestSing_{
    public static void main(String[] args) {
        sing_ sing = sing_.getSing();
        System.out.println(sing);
        System.out.println(sing_.price);
        System.out.println("================");
        AA aa = AA.getAa();
        System.out.println(aa);
        System.out.println(AA.price);
    }
}