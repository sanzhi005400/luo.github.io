/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 19:32
 */
public class OverLoadExercise {
    public static void main(String[] args) {
        Methods p1 = new Methods();
//        System.out.println(p1.m(5));
//        System.out.println(p1.m(2,4));
//        p1.m("罗仕杰");

        int p2 = p1.m(10,20);
        System.out.println(p2);

        double p3 = p1.m(30.5,20.7);
        System.out.println(p3);

        double p4 = p1.m(30.5,20.7,50);
        System.out.println(p4);
    }
}

class Methods{
//    public int m(int n){
//        return n*n;
//    }
//
//    public int m(int n,int n2){
//        return n*n2;
//    }
//
//    public void m(String n){
//        System.out.println(n);
//    }

    public int m(int n1,int n2){
        return Math.max(n1, n2);
    }

    public double m(double n1,double n2){
        return Math.max(n1, n2);
    }

    public double m(double n1,double n2,double n3){
        double temp = Math.max(n1, n2);
        return Math.max(n3, temp);
    }
}
