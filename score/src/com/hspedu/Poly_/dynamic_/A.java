package com.hspedu.Poly_.dynamic_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 15:14
 */
public class A {//父类
    public int i = 10;
    //动态绑定机制
    public int sum(){
        return getl()+10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getl(){//当运行到sum里面的getl时候，到底是调用子类的getl（）还是父类的getl（）？【动态绑定机制】
        return i;
    }
}
