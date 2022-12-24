import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/11/11 17:37
 * @description:
 */
public class Card {
    private int index = 0;//对应图片的下标
    public static List<BufferedImage> itemImageList = new ArrayList<BufferedImage>();
    //卡片类型
    public static String ImagePath = "/images/";//图片路径
    public static void init(){
        //图片的初始化
        String path = "";
        for (int i = 0; i <= 5 ; i++) {
                path = ImagePath + "tile_" + i +" .png";
            }
        }
    private void sortImage(){

    }
}




