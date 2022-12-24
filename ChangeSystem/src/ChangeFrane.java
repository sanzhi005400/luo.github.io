import javax.swing.*;
import java.awt.*;

/**
 * @author: 罗仕杰
 * @date: 2022/11/12 20:04
 * @description:
 */
public class ChangeFrane extends JFrame {//一个窗口
    public void Frane(){
        setTitle("零钱通");
        setSize(400,500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel = new JLabel("--------------零钱通菜单---------------",SwingConstants.CENTER);
        this.add(jLabel);

        JButton jButton = new JButton("1. 零钱通明细");
        jButton.setBorderPainted(false);
        JButton jButton1 = new JButton("2. 收益入账");
        jButton1.setBorderPainted(false);
        JButton jButton2 = new JButton("3. 消费");
        jButton2.setBorderPainted(false);
        JButton jButton3 = new JButton("4. 退    出");
        jButton3.setBorderPainted(false);
        add(jButton);
        add(jButton1);
        add(jButton2);
        add(jButton3);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        ChangeFrane changeFrane = new ChangeFrane();
        changeFrane.Frane();
    }
}
