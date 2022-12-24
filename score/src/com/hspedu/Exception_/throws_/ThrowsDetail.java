package com.hspedu.Exception_.throws_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/29 23:11
 * @description:
 */
/*throws注意事项和细节
* 1）对于编译异常，程序中必须处理，比如try—catch或者throws
* 2）对于运行异常，程序中如果没有处理，默认就是throws的方式处理[举例]
* 3）子类重写父类的方法时，对抛出的异常的规定：子类重写方法，所抛出的异常类型要么和父类抛出的异常一直，要么为父类抛出的异常的类型的子类型[举例]
* 4）在throws过程中，如果有方法try—catch，就相当于处理异常，就可以不必throws*/
public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() throws RuntimeException {//默认throws ArithmeticException
        // 1）对于编译异常，程序中必须处理，比如try—catch或者throws
         /*
         //2）对于运行异常，程序中如果没有处理，默认就是throws的方式处理[举例]
        int n1 = 10;
        int n2 = 0;
        double res = n1/n2;
        直接抛异常
        */

    }
}
