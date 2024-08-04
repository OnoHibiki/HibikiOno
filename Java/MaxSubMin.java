import java.util.*;

//入力された数値から最大値と最小値を引いて出力

class MaxSubMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();

        System.out.println("3つ整数を入れてね、その中の最大と最小を引きます");

        for(int i = 0; i < 3 ;i++) {
            System.out.println((i+1)+"個目");
            while (true) {
                try{
                a.add(sc.nextInt());
                break;    
            } catch/*整数以外が入力された場合の処理 */ (InputMismatchException e){
                System.out.println("整数を入れてください");
                sc.next();
            }
            }
        }
        //昇順にソート
        Collections.sort(a);

        //配列の最初と最後を取り出し引き算。今回は3つなので2と0
        //配列数が変動する場合はcollections.maxとminで。というより最初からそうした方が良かった?
        System.out.println(a.get(2)+"-"+(a.get(0))+"="+(a.get(2)-a.get(0)));

    }
}