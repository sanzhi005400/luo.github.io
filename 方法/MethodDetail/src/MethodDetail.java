/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/1 21:11
 */
//public 访问修饰符（作用是控制方法使用范围）一共有四种【public protected 默认 private】
//如果不写就是默认

//1.一个方法最多也有一个返回值【如何返回多个结果？】
//2.返回类型可以为任意类型，包含基本类型或引用类型（数组，对象）

public class MethodDetail {
    public static void main(String[] args) {
        AA p1 = new AA();
        int[] res = p1.getSumAndSum(10,20);
        System.out.println("和="+res[0]);
        System.out.println("差="+res[1]);
    }
}


public class AA{
    public int[] getSumAndSum(int n1,int n2){//一个列表有0个参数，也可以有多个参数，中间用逗号隔开
        //方法中不能再定义方法


        //一个方法最多也有一个返回值【如何返回多个结果？返回数组】

        int[] resArr = new int[2];
        //创建一个数组
        resArr[0] = n1 + n2;//返回两数之差给到数组1
        resArr[1] = n1 - n2;//返回两数之和给到数组2
        return resArr;
    }

    public double f1(){
        //3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值，而且要求返回值类型必须和return的值类型一致或者兼容
        double d1 = 1.1*8;
        return d1;
        //4.如果方法时void，则方法体重可以没有return语句，或者只写return语句（但没有值）
    }
}


