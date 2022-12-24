import javax.swing.*;
import java.awt.*;

/**
 * @author: 罗仕杰
 * @date: 2022/11/11 15:13
 * @description:
 */
public class GamePanel extends JPanel{
    GamePanel gamePanel=this;
    private JFrame mainFrame=null;


    //构造里面初始化相关参数
    public GamePanel(JFrame frame){
        this.setLayout(null);
        mainFrame = frame;
        mainFrame.setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
    }
}
