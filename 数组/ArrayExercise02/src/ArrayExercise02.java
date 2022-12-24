/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 23:19
 */
//请求出一个数组int【】的最大值{4，-1，9，10,23}，并得到对应的下表
public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] number = {12,-1,9,10,23};
        int max = number[0];
        int x = 0;
        for(int i = 1;i < number.length;i++){
            if (max < number[i]) {
                max = number[i];
                x = i;
            }



        }
        System.out.println("最大值是："+ max + "坐标是" + x);
    }
}
