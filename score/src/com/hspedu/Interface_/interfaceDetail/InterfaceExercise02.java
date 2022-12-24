package com.hspedu.Interface_.interfaceDetail;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 19:55
 * @description:
 */
public class InterfaceExercise02 {
    public static void main(String[] args) {
        CCC ccc = new CCC();
        ccc.pX();
    }
}

interface AAA{
    int x = 10;
}

class BBB{
    int x = 1;
}

class CCC extends BBB implements AAA{
    public void pX(){
        //System.out.println(x); 错误，原因是不明确的x
        //可以明确指定的x
        System.out.println("接口的x= "+AAA.x+" 父类的x= "+super.x);
    }
}