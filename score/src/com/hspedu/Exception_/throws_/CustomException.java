package com.hspedu.Exception_.throws_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/30 12:04
 * @description:
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        //要求范围在18-120之间，否则抛出异常
        if(age >= 18 && age <= 120){
            throw new AgeException("年龄需要在18到120之间");
        }
    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
