/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/3 14:43
 */
public class StringTobosic {

    //编写一个main方法
    public static void main(String[] args){

        //基本数据类型->String

        int n1=100;
        float f1= 1.4f;
        double d1= 4.5;
        boolean b1= true;
        String s1= n1+ "";
        String s2= f1+ "";
        String s3= d1+ "";
        String s4= b1+ "";
        System.out.println(s1+""+ s2+""+ s3+""+ s4);

        //String->对应的基本数据类型
        //调用到语法：通过基本类型的包装类调用parsexx方法即可
        String s5 = "123";
        //会在oop里详细说
        //解读 使用 基本数据类型对应的包装类
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        boolean b = Boolean.parseBoolean("true");
        long num4 = Long.parseLong(s5);
        short num5 = Short.parseShort(s5);
        System.out.println("=========");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(b);
        System.out.println(num4);
        System.out.println(num5);


    }
}
