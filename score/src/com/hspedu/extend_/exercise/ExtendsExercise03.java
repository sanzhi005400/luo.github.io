package com.hspedu.extend_.exercise;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/20 16:42
 */
public class ExtendsExercise03 {
    public static void main(String[] args) {
        System.out.println("===========PC类==============");
        System.out.println();
        PC pc = new PC();
        pc.setBrand("索尼");
        pc.setCPU("8核cpu");
        pc.setMemory("16内存");
        pc.setHardDisk("512g硬盘");
        pc.showPc();
        System.out.println("\n");


        //================================================
        System.out.println("============NotePad类=============");
        System.out.println();
        NotePad notePad = new NotePad();
        notePad.setColor("黄色");
        notePad.setCPU("4核cpu");
        notePad.setHardDisk("8内存");
        notePad.setMemory("256g硬盘");
        notePad.showNotePad();


        //================================================
        System.out.println();
        System.out.println("============父类=============");
        Computer computer = new Computer();
        System.out.println(computer.GetDetail());


    }
}

class Computer {
    private String CPU;
    private String Memory;
    private String HardDisk;



    public Computer(String CPU, String memory, String hardDisk) {//有参构造器
        this.CPU = CPU;
        this.Memory = memory;
        this.HardDisk = hardDisk;
    }

    public Computer() {//无参构造器
    }

    //==========================构造器=============================
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(String hardDisk) {
        HardDisk = hardDisk;
    }

    public String GetDetail(){
       return CPU+Memory+HardDisk;
    }
}


//==========================封装=============================


class PC extends Computer{
    private String brand;

    public PC() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showPc(){
        System.out.println("品牌为"+this.brand+" "+"CPU是"+this.getCPU()+" "+"内存是"+this.getMemory()+" "+"硬盘是" + " " +this.getHardDisk());
        System.out.println(GetDetail()+"brand"+brand);
    }
}

class NotePad extends Computer{
    private String color;

    public NotePad() {

    }

    public NotePad(String CPU, String memory, String hardDisk, String color) {
        super(CPU, memory, hardDisk);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showNotePad(){
        System.out.println("颜色为"+this.color+" "+"CPU是"+this.getCPU()+" "+"内存是"+this.getMemory()+" "+"硬盘是" + " " +this.getHardDisk());
        System.out.println(GetDetail()+"color"+color);
    }

}