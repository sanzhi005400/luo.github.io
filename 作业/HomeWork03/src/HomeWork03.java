/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 19:10
 */
//编写类Book,定义方法updatePrice，实现更改某本书的价格，具体：如果价格》150，则更改为150，如果价格》100，更高为100，否者不变
public class HomeWork03 {
    public static void main(String[] args) {
        Book a1 = new Book("计算机科学与技术",300);
        Book a2 = new Book("计算机网络基础",145);
        a1.updatePrice();
        a2.updatePrice();
//        System.out.println(a1.price);
//        System.out.println(a2.price);
        a1.display();
        a2.display();
    }
}




class Book{
    String name;//书名
    double price;//价格

    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){//定义方法updatePrice，实现更改某本书的价格
        if(this.price > 100 && this.price < 150 ){
            this.price = 100;
        }else if (this.price > 150){
            this.price = 150;
        }
    }

    //显示书籍的情况
    public void display(){
        System.out.println("书名="+this.name);
        System.out.println("价格="+this.price);
        System.out.println();
    }
}