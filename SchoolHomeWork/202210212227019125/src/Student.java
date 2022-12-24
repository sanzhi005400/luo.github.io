/**
 * Created by Administrator on 2022/10/22.
 */
class Student {
    private String name;//名字
    private int age;//年龄
    private String classes;//班级
    private int StudentId;//学号
    private double score;//成绩
    //================成员属性======================


    public Student() {
    }

    public Student(String name, int age, String classes, int StudentId, double score){
        this.name = name;
        this.age = age;
        this.classes = classes;
        this.StudentId = StudentId;
        this.score = score;
    }


    public Student(int studentId, double score) {
        StudentId = studentId;
        this.score = score;
    }

//================构造器======================


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void PrintInfo(){
        System.out.println("学生姓名是:"+getName()+" "+"学生的年龄是:"+getAge()+" "+"学生的班级是:"+getClasses()+" "+"学生的学号是:"+" "+"学生的成绩是:"+getScore());
    }
}
