package com.home;

/**
 * @author: 罗仕杰
 * @date: 2022/11/23 11:47
 * @description:
 */
public class Student extends Person implements FarePromotion{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void Discount() {

    }
}
