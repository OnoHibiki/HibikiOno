import java.util.Scanner ; 

//10個の入力値を受け取り配列に入れ、拡張for文で全て出力

class TenPrint{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        //配列を作り１０個書格納スペースを作る
        String[] s = new String[10];
        
        //要素を１０個取得
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("あと"+(10-i)+"個、単語を入力してね");
            s[i] = Scanner.nextLine();
        }

        System.out.println("以下、あなたが入力した１０個の単語です");

        for(String t :s){
            System.out.println(t);
        }
        Scanner.close();
    }
}