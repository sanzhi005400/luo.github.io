/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/28 22:56
 */
public class TwoDimenseional01 {
    public static void main(String[] args) {

        int arr[][] = new int[3][];
        for(int i = 0;i < arr.length;i++){
            arr[i] = new int[i + 1];

            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = i + 1;
            }
        }

    }
}
