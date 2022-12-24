package com.hspedu.Object_.Exercise_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/31 21:13
 */
public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等？" + (it == fl));//true 判断值是否相等
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和A是否相等？" + (it == ch1));//true 判断值是否相等，会转换成int类型，A是65
        System.out.println("12和ch2是否相等？" + (12 == ch2));//true 判断ch2的值是否等于12是否相等

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等？" + (str1 == str2));//false 判断引用类型是否同一个
        System.out.println("str1是否equals str2？" + (str1.equals(str2)));//true 判断字符串是否相等，调用String的equals的方法

        //System.out.println("hello" == new java.sql.Date());//编译器直接报错，这两个对象不是一个对象也没有继承关系
    }
}
