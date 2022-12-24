import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/27 21:18
 */
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("数组大小为");
        int len = myScanner.nextInt();//数组大小

        int[] arr = new int[len];
        for(int i = 0;i < arr.length;i++ ){
            System.out.println("第"+(i+1)+"个元素");
            int num3 = myScanner.nextInt();
            arr[i] = num3;
        }//为数组填入确切的值

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");

        while(true) {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }//建立一个新数组并把arr的值给到新数组用于扩容

            System.out.println("请输入需要添加的值");
            int num = myScanner.nextInt();
            arrNew[arrNew.length - 1] = num;//从键盘获得用户添加新的值
            arr = arrNew;//并把新数组覆盖旧数组

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
            }//遍历添加完的数组
            System.out.println("\n");

            System.out.println("是否继续添加y/n");
            System.out.println("\n");

            char num1 = myScanner.next().charAt(0);
            if(num1 != 'y'){
                break;
            }//判断是否继续添加


        }
        System.out.println("=====你退出了添加=====");
    }
}
