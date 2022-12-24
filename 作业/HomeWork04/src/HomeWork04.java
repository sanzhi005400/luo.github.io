/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 20:02
 *///编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
public class HomeWork04 {
    public static void main(String[] args) {
        //我写的
//        int[] number = {10,20,30,40,50,60};
//        A03 a03 = new A03();
//        a03.copyArr(number);
//        System.out.println();
//        System.out.println("原数组是");
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i]+"\t");
//        }
//        System.out.println();
        int[] oldArr = {10,20,30,40,50,60,70,80,90,100};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("新数组是");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("旧数组是");
        for (int i = 0; i < oldArr.length; i++) {
            System.out.print(oldArr[i]);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println(a03.hashCode());//输出哈希证明地址不一样
        System.out.println(newArr.hashCode());
//证明复制成功


    }
}

class A03{
//我自己写的
//    public void copyArr(int[] map){
//        int[] map2 = new int[map.length];
//        for (int i = 0; i < map.length; i++) {
//            map2[i] = map[i];
//        }
//        System.out.println("复制出来的数组是");
//        for (int i = 0; i < map2.length; i++) {
//            System.out.print(map2[i]+"\t");
//        }
//    }

    public int[] copyArr(int[] oldArr){
        int[] newArr = new int[oldArr.length];
        //遍历oldArr，将元素靠背到newArr
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}
