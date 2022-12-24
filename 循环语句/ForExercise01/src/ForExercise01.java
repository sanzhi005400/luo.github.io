/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/21 20:33
 */
//完成下面的表达式输出
//0+5=5 1+4=5 2+3=5 3+2=5 4+1=5 5+0=5
//public class ForExercise01 {
//    public static void main(String[] args) {
//        int count = 0;
//        for(int i =0, j =5;i <= 5;i++,j--){
//            count = i+j;
//            System.out.println( i +"+"+ j + "=" + count);
//        }
//    }
//}自己写的




public class ForExercise01{
    public static void main(String[] args) {
        int n = 7;//表达式的值
        for(int i =0;i <= n;i++){
            System.out.println(i+"+"+(n-i)+"="+n);
        }
    }
}//老师的代码(编程思维)