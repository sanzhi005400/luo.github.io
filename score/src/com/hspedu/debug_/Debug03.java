package com.hspedu.debug_;

import java.util.Arrays;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/1 20:41
 */
//演示如何追源码，看看java设计者是在怎么实现的
public class Debug03 {
    public static void main(String[] args) {
        //debug 源码
        int arr[] = {8,-1,199,70,10};
        //排序，追入sort的源码
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
