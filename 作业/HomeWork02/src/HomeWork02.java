import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 18:58
 */
//编写类A02，定义方法find，实现查找某字符数组中的元素查找，并返回索引，如果找不到返回-1


public class HomeWork02 {
    public static void main(String[] args) {
        Scanner mySacnner = new Scanner(System.in);
        String[] number = {""};

        System.out.println("字符串列表有");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();



        A02 a02 = new A02();
        System.out.println("请输入要查找的字符串");
        String name = mySacnner.next();

        System.out.println(a02.find(name,number));
    }
}

class A02{//编写类A02

    public int find(String x,String[] map){//定义方法find
        if(map != null && map.length > 0) {

            //实现查找某字符数组中的元素查找，并返回索引，如果找不到返回-1
            int index;
            for (int i = 0; i < map.length; i++) {
                if (x.equals(map[i])) {
                    return i;
                }

            }
        }return -1;
    }
}
