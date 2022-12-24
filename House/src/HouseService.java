import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/6 15:26
 */
public class HouseService{
    private House[] houses;//保存House对象
    private int houseNum = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id自增长到哪个值
    public HouseService(int size){
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //测试，初始化
        //houses[0] = new House(1,"jack","112","adad",2000,"未出租");
    }
    public House[] list(){
        return houses;
    }

    //添加新对象，返回boolean
    public boolean add(House p){
            //判断是否可以继续添加（暂时不考虑数组扩容的问题）=====(能否加入数组的扩容机制)
            if(houseNum == houses.length){//不能再添加了
                System.out.println("数组已满不能再添加了");
                return false;
            }
            //把新对象加入到数组
            houses[houseNum - 1] = p;
            houseNum++;//新增一个房屋信息
        //程序员需要设计一个id自增加的机制
        idCounter++;
        p.setId(idCounter);//更新这个p的id
        return true;
    }


    public boolean del(int delid){
        //应当先找到删除的房屋信息的对应下标
        //下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(delid == houses[i].getId()){
                //删除的房屋对应的id，在数组下标为i的元素
                index = i;//使用index记录i
            }
        }
        if(index == -1){
            //说明delid不存在在数组
            return false;
        }
        //如果说找到了如何删除
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] =null;//把当前
        return true;
    }

}
