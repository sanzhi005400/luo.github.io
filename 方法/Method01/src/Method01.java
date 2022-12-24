import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/1 18:34
 */
public class Method01 {
    public static void main(String[] args) {
        //方法使用
        //1.方法写好后，如果不去调用（使用），不会输出
        //2.先创建一个对象，然后调用方法
        Person p1 = new Person();
        p1.speak();//调用方法
        p1.cal01();//调用cal01方法

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入累加的最终值");
        int n = myScanner.nextInt();//键盘输入一个数n
        p1.calo2(n);//调用了有形参的方法


        int returnRes = p1.getSum(10,20);
        System.out.println("getsum方法返回的值等于"+returnRes);
    }
}






class Person{
    String name;
    int age;
    //方法（成员方法）
    //添加speak成员方法，输出我是一个好人
    //1.public 表示方法时公开的
    //2.void 表示方法没有返回值
    //3.speak（） speak是方法名 （）是形参列表
    //4.{} 方法体 可以写我们要执行的代码
    //5.System。out。println（） 表示方法时输出一句话
    public void speak(){
        System.out.println("我是一个好人");
    }


    public void cal01(){//输出1+2+。。。+1000的和
        int sum = 0;
        for (int i = 1;i <= 1000;i++){
            sum += i;
        }
        System.out.println(sum);
    }


    //添加cal02 成员方法，该方法可以接受一个数n，计算从1+。。。+n的结果
    public void calo2(int n){//形参列表，当前有一个形参n，可以接受用户输入
        int sum01 = 0;
        for(int j = 0;j <= n;j++){
            sum01 += j;
        }
        System.out.println("方法cal02的输出：" + sum01);
    }

    public int getSum(int num1,int num2){//int证明方法执行后，返回一个int值
        //getsum方法名
        //（int num1，int num2）表示形参列表，；两个形参，可以接受用户传入的两个数

        //添加方法计算两个数的和
        int res = num1 + num2;
        return res;//表示把res的值，返回给
    }
}



