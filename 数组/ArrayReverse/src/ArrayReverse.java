/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/27 17:37
 */
//翻转数组
public class ArrayReverse {
    public static void main(String[] args) {
        //把arry1【0】和arry1【5】交换
        //把arry1【1】和arry1【4】交换
        //把arry1【2】和arry1【3】交换
        //一共要交换3次 = arry1.lenth / 2
        //每次交换 对应下表是 arry1【i】 和 arry1【arry1.length -1-i】
        int[] arry1 = {11,22,33,44,55,66,77,88};
        int temp = 0;
        int len = arry1.length;
        for(int i = 0;i < len/ 2;i++){
             temp = arry1[len - 1 - i];//保存
           arry1[len -1 -i] = arry1[i];
           arry1[i] = temp;
        }
        for(int i = 0;i < arry1.length;i++){
            System.out.print(arry1[i]+"\t");
        }

    }
}
