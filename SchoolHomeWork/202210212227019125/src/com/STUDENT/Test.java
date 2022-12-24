package com.STUDENT;

import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/22 12:22
 */

public class Test {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入学生个数");
        int num = myScanner.nextInt();
        System.out.println("学生姓名" + " " + "课程成绩");


        for (int i = 0; i < num; i++) {
            String name = myScanner.next();
            int score = myScanner.nextInt();
            new Student(name,score);

        }

        Student.PrintInfo();




    }
}
