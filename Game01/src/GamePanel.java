import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

/**
 * @author: 罗仕杰
 * @date: 2022/11/11 15:51
 * @description:
 */
public class GamePanel extends JPanel implements ActionListener {

    GamePanel gamePanel = this;
    private JFrame mainFrame = null;
    public GamePanel(JFrame frame){
        //构造里面初始化相关参数
        this.setLayout(null);
        mainFrame = frame;
        mainFrame.setVisible(true);
        this.setBackground(Color.WHITE);
        this.setSize(100,100);
        iniMenu();
    }


    private void iniMenu(){
        JMenuBar Bar1 = new JMenuBar();

        JMenu jMenu = new JMenu("游戏");
        jMenu.setFont(new Font("黑体",Font.BOLD,15));
        JMenu jMenu1 = new JMenu("帮助");
        jMenu1.setFont(new Font("黑体",Font.BOLD,15));

        JMenuItem item1 = new JMenuItem("开始新游戏");
        item1.setFont(new Font("黑体",Font.BOLD,15));
        JMenuItem item2 = new JMenuItem("退出");
        item2.setFont(new Font("黑体",Font.BOLD,15));
        JMenuItem item3 = new JMenuItem("操作说明");
        item3.setFont(new Font("黑体",Font.BOLD,15));
        JMenuItem item4 = new JMenuItem("胜利条件");
        item4.setFont(new Font("黑体",Font.BOLD,15));

        jMenu.add(item1);
        jMenu.add(item2);

        jMenu1.add(item3);
        jMenu1.add(item4);

        Bar1.add(jMenu);
        Bar1.add(jMenu1);


        item1.addActionListener(this);
        item1.setActionCommand("Start");
        item2.addActionListener(this);
        item2.setActionCommand("Exit");
        item3.addActionListener(this);
        item3.setActionCommand("Help");
        item4.addActionListener(this);
        item4.setActionCommand("Win");


       mainFrame.setJMenuBar(Bar1);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();
        if("Start".equals(command)){


        }
    }
}

