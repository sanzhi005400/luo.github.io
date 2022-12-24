/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/2 21:05
 */
public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        AA p1 = new AA();
        p1.swap(a, b);

        System.out.println("a=" + a + "b=" + b);
    }
}

class AA{
    public void swap(int a,int b){
        int temp =a;
        a = b;
        b = temp;
        System.out.println("a="+a+"\tb="+b);
    }
}