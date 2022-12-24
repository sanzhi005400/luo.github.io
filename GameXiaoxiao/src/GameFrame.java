import javax.swing.*;
import java.awt.*;

/**
 * @author: 罗仕杰
 * @date: 2022/11/11 15:10
 * @description:
 */
public class GameFrame extends JFrame{
    public void GameFrame(){
        setTitle("消消乐");//设置标题
        setSize(400, 400);//设定尺寸
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮是关闭程序
        setLocationRelativeTo(null);   //设置居中
    }
}
