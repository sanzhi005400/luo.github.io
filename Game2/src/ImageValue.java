import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author: 罗仕杰
 * @date: 2022/11/11 18:38
 * @description:
 */
public class ImageValue {

    //小卡片
    public static List<BufferedImage> itemImageList = new ArrayList<BufferedImage>();
    //路径
    public static String ImagePath = "/images/";

    //将图片初始化
    public static void init() {
        String path = "";
        //图片初始化
        for (int i = 0; i <= 5; i++) {
            try {
                path = ImagePath + "tile_" + i + ".png";
                itemImageList.add(ImageIO.read(ImageValue.class.getResource(path)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    private void initCards() {
        Card card = new Card(0, 0, 0, this);
        cards[0][0] = card;
    }
}
}
