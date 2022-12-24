package com.hspedu.Poly_.detail;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/28 19:58
 */
//instanceOf 比较操作符，用于判断对象的类型是否为XX类型或XX类型的子类型
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//为真
        System.out.println(bb instanceof AA);//为真

        AA aa = new BB();
        System.out.println(aa instanceof AA);//为真
        System.out.println(aa instanceof BB);//为真

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        System.out.println(obj instanceof BB);//false

        String str = "来吧";
        System.out.println(str instanceof Object);//为真

    }
}

class AA{
}

class BB extends AA{
}