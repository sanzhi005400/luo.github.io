package com.hspedu.main_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/15 17:00
 * @description:
 */
public class main_ {
    public static void main(String[] args) {
        //理解main方法语法
        //深入理解main方法解释主要的方法的形式:public static void main(String[] args){}
        // 字符串参数java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public
        // java虚拟机在执行main()方法时不必创建对象，所以该方法必须是static
        // 该方法接收String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数.
        // 案例演示，接收参数.java执行的程序参数1 参数2 参数3
        //idea中，打开当前文件运行窗口选项，Edit configurations里面的Program arguments添加测试参数
    }
}
