package pkg;

import com.hspedu.modifier.A;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/15 15:40
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下可以访问public修饰的属性或方法
        //但不能访问protected和默认，private修饰的属性和方法
        System.out.println(a.n1);
        a.m1();
        System.out.println();


    }
}
