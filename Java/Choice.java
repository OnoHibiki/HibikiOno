import java.util.*;


//配列aにn個数字を入れて、そこからm番目の数字を出力

class Choice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //配列数
        System.out.println("数字を入れられる箱の数を入れてね");
        int n = sc.nextInt();

        //配列aにnの数だけ数字を入れてもらう
        List<Integer> a = new ArrayList<>();

        System.out.println("その箱に数字を詰め込んでいってね");
        for(int i = 0 ; i < n ; i++){
            System.out.println((i+1)+"個目");
            a.add(sc.nextInt());
        }

        //取り出したい場所
        System.out.println("取り出したい数字の場所を入れてね");
        int m = sc.nextInt();
        if(n >= m){
        //出力（配列は０から始まるため-1）
        System.out.println(a.get(m-1));
        }else/*n以上入れてきよったら*/{
            System.out.println("入力した数字の数以上の場所を入れるな");
        }
        sc.close();
    }
}