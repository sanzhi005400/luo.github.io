package com.hspedu.Exception_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/28 22:07
 * @description:
 */
/*1）如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块
* 2）如果异常没有发生，则顺序执行try的代码块，不会进入到catch
* 3）如果希望不管是否发生异常，都执行某段代码（比如关闭连接，释放资源等）
* 则使用如下代码-finally{}
* 4)可以有多个catch语句，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前，比如(Exception在后，NullPointerException在前)
* 如果发生异常，只会匹配一个catch
* */
public class TryCatchDetail {
    public static void main(String[] args) {
        //1）如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块
        try {
            String str = "hsd a ";
            int a = Integer.parseInt(str);//将字符串转换成整型
            System.out.println("数字"+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息"+e.getMessage());
        }finally {//3）如果希望不管是否发生异常，都执行某段代码（比如关闭连接，释放资源等）则使用如下代码-finally{}
            System.out.println("finally代码块被执行。。。。。。");
        }
        System.out.println("程序继续。。。。。。");
    }
}
