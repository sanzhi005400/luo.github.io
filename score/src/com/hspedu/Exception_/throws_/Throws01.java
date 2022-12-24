package com.hspedu.Exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author: 罗仕杰
 * @date: 2022/11/29 22:58
 * @description:
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2() throws FileNotFoundException,NumberFormatException,ArithmeticException{//可以写父类，也可以写异常
        //创建了一个文件流对象
        //异常处理
        //这里是一个FileNotFoundException编译异常
        //1.使用前面讲过的try—catch—finally
        //2.使用throws，抛出异常,让调用f1方法的调用者
        //3.throws 关键字后也可以是异常列表，即可以抛出多个异常
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
