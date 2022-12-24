/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/6 16:51
 */
public class TestUtility {
    public static void main(String[] args) {
        //测试工具类

//        String s = Utility.readString(3);//要求输入一个字符串，长度最大为3
//        System.out.println("s="+s);

        String s2 = Utility.readString(10,"hspedu");//要求输入一个字符串，长度最大为10，如果用户直接回车，就会给个默认值
        System.out.println("s2="+s2);

        //这里能直接使用类调用方法，为什么可以用类名直接调用方法
        //因为当一个方法时static时候，就是一个静态方法
        //静态方法可以直接通过类名调用。
    }
}
