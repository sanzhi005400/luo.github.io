/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/18 18:39
 */
//演示赋值运算符的使用
public class AssignOperator {
    public static void main(String[] args){

        int n1 = 10;
        n1 += 4;//n1 = n1 + 4
        System.out.println(n1);//14
        n1 /= 3;
        System.out.println(n1);//4
        //赋值运算的特点
        //1.运算顺序从右往左
        //2.赋值运算符的左边只能是变量，右边可以是常量，表达式，变量
        //3.复合赋值运算符等价


        //4.复合赋值运算符会进行类型转换
        byte b = 3;
        b += 2;//等价于b = (byte)(b+2)

    }
}
