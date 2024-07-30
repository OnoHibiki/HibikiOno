//入力された整数の中で一番小さい値を出力します

import java.util.Scanner;
class Min{
    public static void main(String[] args){
        int min = 11;
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<5;i++){
            System.out.println("１〜１０までの整数を5個入力してね。最小値を出力します");
            int n = sc.nextInt();
        if(11 > n)/*１〜１０のルール守ってたら*/{
            if(n < min){
                min = n ;
            }
        }else/*１１以上入力したら*/{
            System.out.println("ルールを守れないものは去れ");
            System.exit(0);/*終了。チャンスは与えない */
            }
        
        }
        System.out.println("最小値は"+min);
    }
}

//改良の余地有りな気がします