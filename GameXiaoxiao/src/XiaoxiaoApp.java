/**
 * @author: 罗仕杰
 * @date: 2022/11/11 15:12
 * @description:
 */
public class XiaoxiaoApp {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        GamePanel panel = new GamePanel(frame);
        frame.add(panel);
        frame.setVisible(true);//设定显示
    }
}
