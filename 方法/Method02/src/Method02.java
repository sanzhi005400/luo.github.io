/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/1 20:47
 */
//提高代码的复用性
//可以将实现的细节封装起来，然后供其他用户来调用即可

public class Method02 {
    public static void main(String[] args) {
//        int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
//        for(int i = 0;i < map.length;i++){
//            for(int j = 0;j < map[i].length;j++){
//                System.out.print(map[i][j]);
//
//            }
//            System.out.println();
//        }
//    }
// 传统遍历，如果要求再次遍历，需要再次复制一段代码
        MyTools p1 = new MyTools();//创建一个MyToolsd对象
        int[][] map1 = {{1,1,1},{1,1,0},{1,2,3}};
        p1.Input(map1);
        //成员方法的调用
        p1.Input(map1);
        p1.Input(map1);

    }
}

//把输出的功能写到一个类的方法中，然后调用该方法即可
class MyTools {
    //接受一个二维数组
    public void Input(int[][] map) {
        System.out.println("=============");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}