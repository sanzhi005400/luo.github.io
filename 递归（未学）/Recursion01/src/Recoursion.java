/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/4 23:17
 */
public class Recoursion {
    public static void main(String[] args) {
        Recursion01 num = new Recursion01();

        int num2 = num.factorial(5);
        System.out.println("num2="+num2);
    }
}

class Recursion01{
    public void test(int n){
        if(n > 2){
            test(n -1);
        }
        System.out.println("n="+n);
    }

    public int factorial(int n){
        if(n == 1){
            return 1;
        } else{
            return factorial(n - 1)*n;
        }
    }
}