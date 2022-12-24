import javax.swing.*;
import java.awt.*;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/11 13:54
 */
public class game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("消消乐");
        Container contentPane = frame.getContentPane();
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.YELLOW);
        JButton jButton = new JButton("开始");
        jPanel.add(jButton);
        contentPane.add(jPanel, BorderLayout.SOUTH);
        frame.setSize(640, 800);
        frame.setLocation(640, 100);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮是关闭程序
        frame.setVisible(true);
    }
}
