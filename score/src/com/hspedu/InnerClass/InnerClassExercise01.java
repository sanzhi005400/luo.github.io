package com.hspedu.InnerClass;

/**
 * @author: 罗仕杰
 * @date: 2022/12/17 21:43
 * @description:
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
      //匿名内部类可以当实参直接传递
        f1(new IL(){
            @Override
            public void show() {
                System.out.println("这是一名画....");
            }
        });
    }
    public static void f1(IL il){//静态方法，形参是接口类型
        il.show();
    }
}
interface IL{
    public void show();
}

