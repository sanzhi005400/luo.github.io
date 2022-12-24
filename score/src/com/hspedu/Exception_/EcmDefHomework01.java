package com.hspedu.Exception_;

import java.util.Scanner;

/**
 * @author: 罗仕杰
 * @date: 2022/11/30 12:11
 * @description:
 *//*1.编写应用程序EcmDef，接受命令行的两个参数（整数）,计算两数相除
 2.计算两个数相除，要求使用方法cal(int n1,int n2)
 3.对数据格式不正确。缺少命令行参数.除0进行异常处理*/
public class EcmDefHomework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int n1 = scanner.nextInt();
        System.out.println("第二个整数");
        int n2 = scanner.nextInt();

    }

}

class ArrayIndexOutOfBoundsException extends RuntimeException{
    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}