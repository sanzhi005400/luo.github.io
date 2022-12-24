import java.util.Scanner;
/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/10 23:31
 */

class calculator {
    public static void main(String[] args) {
        boolean load = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("请输入第一个数");
            double n1 = scanner.nextDouble();
            System.out.println("请输入符号");
            char operator = scanner.next().charAt(0);
            System.out.println("请输入第二个数");
            double n2 = scanner.nextDouble();
            switch(operator){
                case '+':
                    tools.sum(n1,n2);
                    break;
                case '-':
                    tools.reduce(n1,n2);
                    break;
                case '*':
                    tools.multiplication(n1,n2);
                    break;
                case '/':
                    tools.division(n1,n2);
                    break;
            }
            System.out.println("是否退出（Y/N）");
            char exit = scanner.next().charAt(0);
            if(exit == 'Y' || exit == 'y'){
                load = false;
            }
        }while(load);
    }
}



