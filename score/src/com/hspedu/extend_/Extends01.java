package com.hspedu.extend_;
//继承
/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/17 20:02
 */
public class Extends01 {//继承，目的是:解决代码的复用性

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.info();

        Graduate graduate = new Graduate();
        graduate.name = "小花";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(90);
        graduate.info();
    }
}
