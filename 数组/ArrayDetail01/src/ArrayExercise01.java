/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 22:05
 */
//创建一个char类型的26个元素的数组，分别放置A-Z
//使用for循环访问所有元素并打印出来
//提示  char类型数据运算'A'+1->B
public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] number = new char[26];
        for(int j = 0;j < number.length;j++){
            number[j] = (char)('A' + j);
        }

        for(int i = 0;i < number.length;i++){
            System.out.print(number[i]);
        }

    }
}
