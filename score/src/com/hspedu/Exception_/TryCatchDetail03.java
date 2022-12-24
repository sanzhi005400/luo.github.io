package com.hspedu.Exception_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/28 22:38
 * @description:
 */
public class TryCatchDetail03 {
    public static void main(String[] args) {
//5）可以进行try—finally配合使用，这种用法相当于没有不会异常，程序会直接崩溃（应用场景是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑）
        try {
            int n1 = 20;
            int n2 = 0;
            System.out.println(n1/n2);
        } finally {
            System.out.println("执行finally...");
        }
        System.out.println("程序继续执行");//这句话不会执行
    }
}
