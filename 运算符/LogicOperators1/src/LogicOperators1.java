/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/18 17:05
 */
// 短路与&& 和 逻辑与&的区别
public class LogicOperators1 {
    public static void main(String[] args){
        //&& 和 & 案例演示
        //短路与&& 的使用
        int age = 50;
        if(age > 20 && age < 90){
            System.out.println("ok100");
            //短路与&&两边都成立才为真，否则为假
        }
        //逻辑与& 的使用
        if(age > 20 & age < 90){
            System.out.println("ok200");
            //逻辑与&两边都为真，结果为真，否则假
        }
        //区别
        int a = 4;
        int b = 9;
        if(a < 1 && ++b < 5){
            System.out.println("ok300");//对于短路与&&，如果第一个条件为false，则第二个条件不会判断，最终都为false，所以效率高
        }
        System.out.println("a=" + a + " b=" + b);//运行得到结果为4 9，表明++b没有得到执行


        int x = 4;
        int y = 9;
        if(x < 1 & ++y < 5){
            System.out.println("ok400");//对于逻辑与&，不管第一个条件是否为false，第二个条件都会判断，效率低
        }
        System.out.println("x=" + x + " y=" + y);//运行得到结果为4 9，表明++b得到执行

    }
    //开发中，我们使用的基本是短路与&&，效率高
}
