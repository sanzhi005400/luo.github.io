/**
 * @author: 罗仕杰
 * @date: 2022/12/7 15:56
 * @description:
 */
public class Computer {
    private int runState = 0;//初始值为0表示正常运行，1表示蓝屏，2表示冒烟

    public Computer() {
    }

    public Computer(int runState) {
        this.runState = runState;
    }

    public int getRunState() {
        return runState;
    }

    public void setRunState(int runState) {
        this.runState = runState;
    }
    public void run(){
        System.out.println("电脑正在运行");
    }

    public void reset(){
        System.out.println("老师将电脑重启，电脑恢复运行");
        setRunState(0);
    }
}
