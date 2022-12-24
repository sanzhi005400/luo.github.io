package com.hspedu.HomeWork_;

import java.util.Date;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/3 21:42
 */
public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("罗仕杰",18,"医师","男",3000);
        Object doctor1 = new Doctor("罗仕杰",18,"医师","男",3000);
        System.out.println(doctor1.equals(doctor));
    }
}

class Doctor{
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Doctor){
            Doctor p = (Doctor)obj;
            return this.name.equals(p.name) && this.age == p.age
                    && this.job.equals(p.job) && this.gender.equals(p.gender)
                    && this.sal == p.sal;
        }
        return false;
    }
}