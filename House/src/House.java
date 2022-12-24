/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/6 15:26
 */
public class House {
    private int id = 0;//房屋id
    private String name;//名字
    private String phoneNum;//电话
    private String address;//地址
    private double monRent;//月租
    private String state;//状态


    public House() {
    }

    public House(int id, String name, String phoneNum, String address, double monRent, String state) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.monRent = monRent;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonRent() {
        return monRent;
    }

    public void setMonRent(double monRent) {
        this.monRent = monRent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return   id +
                "\t" + name +
                "\t" +phoneNum  +
                "\t" +address  +
                "\t" + monRent +
                "\t" + state;
    }
}
