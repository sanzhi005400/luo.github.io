/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/18 17:46
 */
//短路或|| 和 逻辑或| 的案例演示
public class LogicOperators2 {
    public static void main(String[] args){
        int age = 50;
        if(age > 20 || age <30){
            System.out.println("ok100");//只要有一个为真，结果就为真
        }
        if(age > 20 | age <30){
            System.out.println("ok200");//只要一个为真，结果为真
        }

        //区别
        // ||短路或：如果第一个条件为true，则第二个条件不会判定，最终结果为true，效率高
        int a = 4;
        int b = 9;
        if(a > 1 || ++b > 4){
            System.out.println("ok300");
        }
        System.out.println("a=" + a + " b=" + b);

        // |逻辑或：不管第一个条件是否为true，第二个条件都要判断，效率低
        int x = 4;
        int y = 9;
        if(x > 1 | ++y > 4){
            System.out.println("ok400");
        }
        System.out.println("x=" + x + " y=" + y);
    }
}
