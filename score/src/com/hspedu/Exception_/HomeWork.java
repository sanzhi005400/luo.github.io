package com.hspedu.Exception_;

import java.util.Scanner;

/**
 * @author: 罗仕杰
 * @date: 2022/11/28 22:56
 * @description:
 */
/*课后习题
* 如果用户输入的不是一个整数，就提醒他反复输入，直到输入一个整数为止*/
public class HomeWork {
    public static int method(){
         int keyAdd = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            keyAdd = scanner.nextInt();
            return keyAdd;
        } catch (Exception e) {
            System.out.println("请重新输入整数");
            keyAdd = method();
        }
        return keyAdd;
    }

    public static void main(String[] args) {
        int s;
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        s = method();
        System.out.println("整数为" + s);
    }
}
