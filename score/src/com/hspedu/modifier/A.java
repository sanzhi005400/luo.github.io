package com.hspedu.modifier;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/15 15:27
 */
public class A {

    //是个属性
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private  int n4 = 400;


    public void m1(){
        //该方法可以访问是个属性
        System.out.println("n1="+n1+"n2="+n2+"n3="+n3+"n4="+n4);
    }


    protected void m2(){

    }


    void m3(){

    }


    private void m4(){

    }

    public void hi(){//再同一个调用四种修饰符都可以
        m1();
        m2();
        m3();
        m4();
    }


}
