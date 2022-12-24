/**
 * @author: 罗仕杰
 * @date: 2022/11/11 18:37
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        GamePanel panel = new GamePanel(frame);
        frame.add(panel);
        frame.setVisible(true);//设定显示


    }
}
