/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 0:46
 */
class book{
    String BookName;//书名
    double BookCost;//成本
    double BookPrice;//价格
    int Stock;//库存

    public double Calculation(int Sales){
        int Stock1 = Stock - Sales;//库存
        double TotalPrice = BookPrice * Sales;//这本书总收入
        double TotalCost = BookCost * Sales;//这本书总成本
        double TotalTurnover = TotalPrice - TotalCost;//这本书的营业额

        System.out.println(BookName+"销售量="+Sales);
        System.out.println(BookName+"库存="+Stock1);
        System.out.println(BookName+"总营业额="+TotalTurnover+"\n");
        return TotalTurnover;
    }

}