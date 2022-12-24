/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/11 19:57
 */
//定义Music类，里面有音乐名name，音乐时长times，并有播放play功能和返回本身属性信息的功能方法getinfo
public class HomeWork08 {
    public static void main(String[] args) {
        Music m1 = new Music();
        m1.name = "青花瓷";
        m1.times = 5.3;

        m1.play("青花瓷",5.3);
        m1.getinfo("青花瓷",5.3);
    }
}

class Music{
    String name;
    double times;

    public void play(String name,double times){
        System.out.println("播放"+name);
    }

    public void getinfo(String name,double times){
        name = this.name;
        times = this.times;
        System.out.println(name+times);
    }
}