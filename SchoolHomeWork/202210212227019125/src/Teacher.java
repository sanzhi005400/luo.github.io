/**
 * Created by Administrator on 2022/10/22.
 */
class Teacher {
    private String name;//名字
    private String classes;//班级
    private int age;//年龄
    private int TeacherId;//教师编号
    private double salary;//工资
//================成员属性======================

    public Teacher() {
    }

    public Teacher(int teacherId, double salary) {
        TeacherId = teacherId;
        this.salary = salary;
    }

    public Teacher(String name, String classes, int age, int teacherId, double salary) {
        this.name = name;
        this.classes = classes;
        this.age = age;
        TeacherId = teacherId;
        this.salary = salary;
    }
//================构造器======================


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int teacherId) {
        TeacherId = teacherId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void PrintInfo(){
        System.out.println("老师姓名是:"+getName()+" "+"老师的年龄是:"+getAge()+" "+"老师的班级是:"+getClasses()+" "+"教师的编号是:"+" "+"教师的工资是:"+getSalary());
    }
}
