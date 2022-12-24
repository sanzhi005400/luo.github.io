import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 0:09
 */
public class Books {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));


        book pc = new book();
        pc.BookName = "面向对象程序设计";
        pc.BookCost = 50;
        pc.BookPrice = 80;
        pc.Stock = 60;
        System.out.println("请输入"+pc.BookName+"书籍的销售量");
        int pcNum = myScanner.nextInt();
        double Count = pc.Calculation(pcNum);


        book data = new book();
        data.BookName = "数据库原理";
        data.BookCost = 30;
        data.BookPrice = 80.5;
        data.Stock = 50;
        System.out.println("请输入"+data.BookName+"书籍的销售量");
        int dataNum = myScanner.nextInt();
        double Count1 =data.Calculation(dataNum);

        double Total = Count1 + Count;

        System.out.println("今日营业额为"+Total);

    }
}
