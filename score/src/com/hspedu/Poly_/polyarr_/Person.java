package com.hspedu.Poly_.polyarr_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 15:39
 */

public class Person {//父类
    private String name;
    private int age;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return name + "说话" +"\t"+ "年龄是" + age;
    }
}
