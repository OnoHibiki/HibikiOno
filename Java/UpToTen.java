import java.util.Scanner;

public class UpToTen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("0~9の正数を入力してね。入力した数値から10までを出力します");
        int a = sc.nextInt();

        if(a >= 0 && a <= 9){
            for(int i = a; i <= 9;i++){
                System.out.println(i+1);
            }
        }else if(a == 10){
            System.out.println("ちょうどやで");
        }else{
            System.out.println("0~9までって書いてたの、読めなかったの？");
        }
    } 
}