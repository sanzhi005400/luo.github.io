package com.hspedu.Exception_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/28 22:17
 * @description:
 *//*4)可以有多个catch语句，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前，比如(Exception在后，NullPointerException在前)
 * 如果发生异常，只会匹配一个catch*/
public class TryCatchDetail02 {
    public static void main(String[] args) {
        //4)可以有多个catch语句，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前，比如(Exception在后，NullPointerException在前)
        //* 如果发生异常，只会匹配一个catch

        try {
            Person person = new Person();
            //person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;//ArithmeticException
        } catch (NullPointerException n) {//如果try代码块有可能有多个异常
            //2.可以使用多个catch分别捕获不同的异常，相应处理
            //3.要求子类异常写前面，父类异常写后面
            System.out.println("空指针异常："+n.getMessage());
        }catch (ArithmeticException a){
            System.out.println("数学异常： "+a.getMessage());
        }catch (Exception e){
            System.out.println("所有异常"+e.getMessage());
        }
    }
}

class Person{
    private String name;
    public String getName(){
        return name;
    }
}