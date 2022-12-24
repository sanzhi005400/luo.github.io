import java.sql.SQLOutput;

/**
 * @author: 罗仕杰
 * @date: 2022/12/7 15:55
 * @description:
 */
public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void test(){
        System.out.println(name+"让同学们自习");
    }

    public void Prelect(Computer p) throws MyException{//讲课
        IfExt(p);
        System.out.println("老师用电脑给同学们讲课");
    }
    public void Practise(Computer p) throws MyException{//练习
        IfExt(p);
        System.out.println(name+"用电脑让同学们做练习");
    }
    public void IfExt(Computer p) throws MyException{//异常处理方法
        if(p.getRunState() == 1) {
            throw new MyException("电脑蓝屏了，请重启");
        }
        if(p.getRunState() == 2){
            throw new MyException("电脑冒烟了请检查故障");
        }
    }
}
