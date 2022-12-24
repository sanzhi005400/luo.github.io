/**
 * @author: 罗仕杰
 * @date: 2022/11/11 18:36
 * @description:
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

/*
 * 画布类
 */
public class GamePanel extends JPanel implements ActionListener {
    GamePanel gamePanel=this;
    private JFrame mainFrame=null;
    //构造里面初始化相关参数
    public GamePanel(JFrame frame){
        this.setLayout(null);
        mainFrame = frame;

        mainFrame.setVisible(true);
    }
    private void initCards() {
        Card card = new Card(0, 0, 0, this);
        card[0][0] = card;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.ITALIC, 18)));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.ITALIC, 18)));
        if ("Exit".equals(command)) {
            Object[] options = { "确定", "取消" };
            int response = JOptionPane.showOptionDialog(this, "您确认要退出吗", "",
                    JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            if (response == 0) {
                System.exit(0);
            }
        }else if("Restart".equals(command)){
            if(!"end".equals(gamePanel.gameFlag)){
                JOptionPane.showMessageDialog(null, "正在游戏中无法重新开始！",
                        "提示！", JOptionPane.INFORMATION_MESSAGE);
            }else {
                restart();
            }
        }else if("help".equals(command)){
            JOptionPane.showMessageDialog(null, "鼠标点击选中后，与相邻的切换，超过3个成行或者成列则消除！",
                    "提示！", JOptionPane.INFORMATION_MESSAGE);
        }else if("win".equals(command)){
            JOptionPane.showMessageDialog(null, "300秒3000分胜利，否则失败！",
                    "提示！", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //初始化按钮
    private void  initMenu(){
        // 创建菜单及菜单选项
        JMenuBar jmb = new JMenuBar();
        JMenu jm1 = new JMenu("游戏");
        jm1.setFont(new Font("黑体", Font.BOLD, 15));// 设置菜单显示的字体
        JMenu jm2 = new JMenu("帮助");
        jm2.setFont(new Font("黑体", Font.BOLD, 15));// 设置菜单显示的字体

        JMenuItem jmi1 = new JMenuItem("开始新游戏");
        JMenuItem jmi2 = new JMenuItem("退出");
        jmi1.setFont(new Font("黑体", Font.BOLD, 15));
        jmi2.setFont(new Font("黑体", Font.BOLD, 15));

        JMenuItem jmi3 = new JMenuItem("操作说明");
        jmi3.setFont(new Font("黑体", Font.BOLD, 15));
        JMenuItem jmi4 = new JMenuItem("胜利条件");
        jmi4.setFont(new Font("黑体", Font.BOLD, 15));

        jm1.add(jmi1);
        jm1.add(jmi2);

        jm2.add(jmi3);
        jm2.add(jmi4);

        jmb.add(jm1);
        jmb.add(jm2);
        mainFrame.setJMenuBar(jmb);// 菜单Bar放到JFrame上

        jmi1.addActionListener(this);
        jmi1.setActionCommand("Restart");
        jmi2.addActionListener(this);
        jmi2.setActionCommand("Exit");

        jmi3.addActionListener(this);
        jmi3.setActionCommand("help");
        jmi4.addActionListener(this);
        jmi4.setActionCommand("win");
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //绘制边框
        BasicStroke bs_2 = new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        Graphics2D g_2d = (Graphics2D) g;
        g_2d.setColor(new Color(0, 191, 255));
        g_2d.setStroke(bs_2);
        g_2d.drawRect(38, 32, 305, 334);

        Card card;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                card = card[i][j];
                if (card != null) {
                    card.draw(g);
                }
            }
        }
    }
    private void sortImage() {
        Collections.shuffle(indexs);
    }
    //初始化下标值
    private void initIndexs() {
        Random random = new Random();
        int n ;
        while(true){//
            n = random.nextInt(6);//随机从6张图片下标中选取[0-5]
            indexs.add(n);
            if(indexs.size()==72){
                break;
            }
        }
    }
    //鼠标事件的创建
    private void createMouseListener() {
        MouseAdapter mouseAdapter = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(!"start".equals(gameFlag)) return ;

                int x = e.getX();
                int y = e.getY();
                Card card;
                for (int i = 0; i <ROWS; i++) {
                    for (int j = 0; j < COLS; j++) {
                        card = cards[i][j];
                        if(card==null)continue;

                        if(card.isPoint(x, y)){
                            MusicPlayer.chooseMisic();
                            if(curCard==null){
                                curCard = card ;
                                card.setSelected(true);
                            }else {
                                int dir= checkTran(card);
                                if(dir!=0&&dir!=4){//相邻才能交换
                                    tran(card,dir);
                                }else {//不是相邻则当前取消选择
                                    curCard.setSelected(false);
                                    card.setSelected(true);
                                    curCard = card ;
                                }
                            }
                            return ;//直接跳出
                        }
                    }
                }
            }
        };
        addMouseMotionListener(mouseAdapter);
        addMouseListener(mouseAdapter);
    }

    private void initCards() {
        Card card;
        index = 0;
        int temp = 0;
        for (int i = 0; i < ; i++) {
            
        }
    }


    private class RefreshThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                if ("start".equals(gameFlag)) {
                    repaint();
                }

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }

    }
    //相邻才能交换
    private int checkTran(Card card) {
        if(card.getpIndex()==curCard.getpIndex()){//相同的不交换
            return 4;
        }

        int x = curCard.getX();
        int y = curCard.getY();

        int x1 = card.getX();
        int y1 = card.getY();

        if(y==y1){//在上下
            if(x1+1==x||x1-1==x){
                return 2;
            }
        }
        if(x==x1){//在左右
            if(y1+1==y||y1-1==y){
                return 1;
            }
        }

        return 0;
    }



}