/**
 * @author ���˽�
 * @version 2022.08
 * @date 2022/9/3 14:43
 */
public class StringTobosic {

    //��дһ��main����
    public static void main(String[] args){

        //������������->String

        int n1=100;
        float f1= 1.4f;
        double d1= 4.5;
        boolean b1= true;
        String s1= n1+ "";
        String s2= f1+ "";
        String s3= d1+ "";
        String s4= b1+ "";
        System.out.println(s1+""+ s2+""+ s3+""+ s4);

        //String->��Ӧ�Ļ�����������
        //���õ��﷨��ͨ���������͵İ�װ�����parsexx��������
        String s5 = "123";
        //����oop����ϸ˵
        //��� ʹ�� �����������Ͷ�Ӧ�İ�װ��
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        boolean b = Boolean.parseBoolean("true");
        long num4 = Long.parseLong(s5);
        short num5 = Short.parseShort(s5);
        System.out.println("=========");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(b);
        System.out.println(num4);
        System.out.println(num5);


    }
}
