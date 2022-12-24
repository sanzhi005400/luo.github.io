import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author: 罗仕杰
 * @date: 2022/11/11 18:40
 * @description:
 */
public class Card {

    private int x = 0;//对应行
    private int y = 0;//对应列
    private int dx = 0;//图形显示左上角x位置
    private int odx = 0;//图形更新后显示左上角x位置
    private int dy = 0;//图形显示左上角y位置
    private int ody = 0;//图形更新后显示左上角y位置
    private int dir = 1;//方向
    private int width =32;//宽
    private int height = 32;//高
    private int pIndex = 0;//对应素材图片下标
    private int index = 0;//对应图片下标值
    private int type = 1;//1：10张的   2：20张的
    private BufferedImage image = null;//图片对象
    private GamePanel panel=null;//GamePanel
    private boolean alive=true;//是否存活
    private boolean selected = false;//是否选中
    private int moveFlag=0;//移动标示  0 不移动 1 横向移动 2纵向移动
    private int speed=15;//移动速度

    public Card(int x, int y, int pIndex, GamePanel panel){
        this.x=x;
        this.y=y;
        this.dx = 40+y*(32+3)+10;
        this.dy = 35+x*(32+3)+10;

        this.panel=panel;
        this.pIndex=pIndex;

        this.image = ImageValue.itemImageList.get(pIndex);
    }
    //绘制
    public void draw(Graphics g) {
        int index = this.index;
        //index 默认是0，就是从图片中截取第一个
        int sx1 = index*32;
        int sy1 = 0;
        //截取的右下角计算
        int sx2 = (index+1)*32;
        int sy2 = 32;

        g.drawImage(this.image,dx, dy,dx+width,dy+height,sx1,sy1,sx2,sy2 ,null );
    }
    private void rock() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (alive) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    index++;
                    if(index==10){
                        index=0;
                    }
                }
            }
        }).start();
    }
    //判断鼠标是否卡片范围内
    boolean isPoint(int x,int y){
        //大于左上角，小于右下角的坐标则肯定在范围内
        if(x>this.dx && y >this.dy
                && x<this.dx+this.width && y <this.dy+this.height){
            return  true;
        }
        return false;
    }


}

