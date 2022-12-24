/**
 * @author: 罗仕杰
 * @date: 2022/12/7 15:56
 * @description:
 */
public class AppTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("宋老师");
        Computer computer = new Computer(2);
        try {
            teacher.Practise(computer);
        } catch (MyException e) {
            e.printStackTrace();
            if(computer.getRunState() == 1){
                computer.reset();
            }
            if(computer.getRunState() == 2){
                teacher.test();
            }
        }
    }
}
