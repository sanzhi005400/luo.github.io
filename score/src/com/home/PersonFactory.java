package com.home;

/**
 * @author: 罗仕杰
 * @date: 2022/11/23 11:50
 * @description:
 */
public class PersonFactory {
    private static double aount = 0;
    /**/
    public static Person create(String name,int age){
        if(age != 0){
            if(age < 18){
                return new Student(name,age);
            }else {return new elderly(name,age);}
        }
        return null;
    }

}

