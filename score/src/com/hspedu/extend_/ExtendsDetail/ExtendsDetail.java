package com.hspedu.extend_.ExtendsDetail;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 16:52
 */
//1.子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，但是私有属性不能在子类直接访问，要通过公共的方法去访问
    //示例是Base和Sub
public class ExtendsDetail {

    public static void main(String[] args) {
        Sub sub = new Sub();//创建子类对象
        //sub.sayOK();
    }
}
