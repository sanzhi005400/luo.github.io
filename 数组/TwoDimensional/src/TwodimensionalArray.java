/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/28 22:39
 */
public class TwodimensionalArray {
    public static void main(String[] args) {
        int arry[][] = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};
        System.out.println("二维数组的元素个数"+arry.length);

        for(int i =0;i < arry.length;i++){
            for(int j =0;j < arry[i].length;j++){
                System.out.print(arry[i][j]);
            }
            System.out.println();
        }
    }
}
