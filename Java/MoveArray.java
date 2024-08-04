import java.util.*;


public class MoveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //まず、n個の箱がある配列aを用意する
        System.out.println("配列数の要素数を決めてね");
        int n = sc.nextInt();


        List<Integer> a = new ArrayList<>();
        for(int i =0;i<n;i++){
            //配列の箱に数字を入れていく
            System.out.println("配列に加えたい数字を入れていってね");
            a.add(sc.nextInt());
        }

        //クエリ実行回数を決めてもらう
        System.out.println("配列に加えたい操作の回数を決めてね");
        int q = sc.nextInt();

        for(int j = 0 ; j< q; j++){
            System.out.println("0か1の指示を入力。0は要素末尾に追加、1は要素末尾削除");
            int query =sc.nextInt();

            if(query == 0){
                //入力が0の場合
                System.out.println("追加したい数字を入力");
                int x =sc.nextInt(); 
                a.add(x);
                for(int b = 0 ; b<a.size(); b++){
                    System.out.print(a.get(b));
                    //要素の間に半角スペース入れて横並びに表示
                    if(b < a.size()-1){
                        System.out.print(" ");
                    }else{
                        //bがa.sizeと＝になった場合、改行
                        System.out.println();
                    }
                }
            }else if(query == 1){
                //入力が1の場合
                a.remove(a.size()-1);
                for(int c = 0 ; c<a.size(); c++){
                    System.out.print(a.get(c));
                    if(c < a.size()-1){
                        //要素の間に半角スペース入れて横並びに表示
                        System.out.print(" ");
                    }else{
                        //bがa.sizeと＝になった場合、改行
                        System.out.println();
                    }
            }
        }else{
            System.out.println("1と２以外入力しないでください");
            j = j-1;
        }
            System.out.println("操作"+q+"回中、"+(j+1)+"回目");
            if(q == j + 1){
                    int d = 0;
                    while(d < a.size()){
                        System.out.print(a.get(d));
                        System.out.print(" ");
                        d = d + 1;
                    }
                    System.out.println("完成！！");
                    
                }
            
            }
        
      }
    }
