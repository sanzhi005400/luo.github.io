package com.pkg;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/15 14:23
 */

import java.util.Arrays;
import java.util.Scanner;//表示只引入java。uitl下的scanner类
//import java.util.*;//表示将包下所有类都引入
public class Import01 {
    public static void main(String[] args) {
        //建议需要使用到什么类就导入哪个类即可，不建议使用*的方式导入
        //用系统提供的Arrys完成数组排序

        int[] arr = {-1,22,33,-5,2,33,43};//对其进行排序
        //传统方法自己编写排序（冒泡）


        bubble arry = new bubble();
        arry.BubbleSort(arr);

        //简便用法包装类
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}


class bubble{

    public void BubbleSort(int[] arr){
        int temp  =0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}