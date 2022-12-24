/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 15:01
 */
public class BreakDetail {
    public static void main(String[] args) {
        label1:
        for(int j = 0;j <= 4;j++){
            label2:
            for(int i = 0;i < 10;i++){
                if(i == 2){
                    break label2;
                }
                System.out.println("i="+i);
            }

        }
    }
}
