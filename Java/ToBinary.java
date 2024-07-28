import java.util.Scanner;

public class ToBinary{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("好きな数字を入力してね。２進数に変換します");
    int ten = sc.nextInt();

    String binary = Integer.toBinaryString(ten);

    System.out.println("１０進数:"+ ten);
    System.out.println("2進数:"+ binary);

    sc.close();
   }
}