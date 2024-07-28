import java.util.Scanner;

public class Subtraction{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("引き算をします。二つ数字を入力してください");

        int one = sc.nextInt();
        int two = sc.nextInt();

        System.out.println(one+"-"+two+"="+(one-two));
    }
}