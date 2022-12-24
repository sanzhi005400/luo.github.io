/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 15:41
 */
public class This01 {//那个对象调用this就代表那个对象
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("大壮",10);
        System.out.println("hashcode的值"+dog1.hashCode());
        dog1.info();

        Dog1 dog2 = new Dog1("大荒",2);
        System.out.println("hashcode的值"+dog2.hashCode());
        dog2.info();
    }
}


