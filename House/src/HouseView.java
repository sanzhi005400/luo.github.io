import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/6 15:24
 */
/*1.显示界面
2.接受用户输入
3.调用HouseService完成对房屋信息的各种修改
* */
public class HouseView {

    private boolean load = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);//设置数组的大小为10


    public void mainMenu() {
        //用户打开软件可以看到主菜单，可以退出软件
        do {
            System.out.println("-----------房屋出租系统------------");
            System.out.println("\t\t1.新 增 房 源");
            System.out.println("\t\t2.查 找 房 屋");
            System.out.println("\t\t3.删 除 房 屋");
            System.out.println("\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t5.房 屋 列 表");
            System.out.println("\t\t6.退      出");
            System.out.println("请选择1-6：");
            Scanner scanner = new Scanner(System.in);
            key = scanner.next().charAt(0);
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':

                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    load = false;
            }
        } while (load);
    }

    //编写addHouse方法接受输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("-----------添加房屋------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);//名字最长8个
        System.out.print("电话：");
        String phone = Utility.readString(12);//电话最长12个
        System.out.print("地址：");
        String address = Utility.readString(16);//地址最长16
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);//状态最长3个
        //创建一个新的House对象，注意id是系统分配的，用户不能输入
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("-----------添加房屋成功------------");
        } else {
            System.out.println("-----------添加房屋失败------------");
        }
    }

    //编写listHouse（）{}方法显示房屋列表
    public void listHouse() {
        System.out.println("-----------房屋列表------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出租）");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {//如果为空就不显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-----------房屋列表显示完毕------------");
    }

    //编写delhouse（）接受用户输入
    public void delHouse() {
        System.out.println("-----------删除房屋------------");
        System.out.print("请选择待删除的房屋编号（-1退出）：");
        int delid = Utility.readInt();
        if(delid == -1){
            System.out.println("-----------放弃删除房屋------------");
            return;
        }
        //注意该方法就有循环逻辑，必须输入y和n
        char choise = Utility.readConfirmSelection();
        if(choise == 'Y'){
            if(houseService.del(delid)){
                System.out.println("-----------删除房屋成功------------");
            }else{
                System.out.println("-----------房屋编号不存在,删除失败------------");
            }
        }else{
            System.out.println("-----------放弃删除房屋------------");
        }
    }




    //exit退出方法
    public void exit(){
        System.out.println("请输入你的选择（Y/N）");
        char key = Utility.readConfirmSelection();
    }

}
