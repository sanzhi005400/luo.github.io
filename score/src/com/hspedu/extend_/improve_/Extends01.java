package com.hspedu.extend_.improve_;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/19 16:45
 *///1.代码的复用性提高了
    //2.代码的扩展性和维护性提高了
    //================================================================
public class Extends01 {
    public static void main(String[] args) {
       com.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明---";
        pupil.age = 15;
        pupil.testing();
        pupil.setScore(90);
        pupil.info();
//===========================分割线=====================================
        com.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "小花----";
        graduate.age = 30;
        graduate.testing();
        graduate.setScore(100);
        graduate.info();
    }
}
