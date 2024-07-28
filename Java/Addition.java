import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("足したい整数を2つ選んでください");
        int one = sc.nextInt();
        int two = sc.nextInt();

        System.out.println(one+"+"+two+"="+(one+two));
    }
}