import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/28 20:14
 */
public class DoubbleSort {
    public static void main(String[] args) {
        //冒泡排序

        System.out.println("请输入数组大小：");
        Scanner myScanner = new Scanner(System.in);
        int len = myScanner.nextInt();
        //手动输入数组大小

        int[] arr = new int[len];//动态创建arr数组

        for(int i = 0;i < len;i++){
            System.out.println("请输入第"+(i+1)+"个元素");
            int num = myScanner.nextInt();
            arr[i] = num;
        }//手动赋值数组


        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len -1; j++) {//len -1次比较
                //如果前面的数大于后面的数，就交换

                if (arr[j] > arr[j + 1]) {//交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int n = 0;n < arr.length;n++){//输出数组
            System.out.print(arr[n]);
            System.out.print("\t");
        }
    }
}
