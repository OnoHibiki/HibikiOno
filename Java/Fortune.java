import java.util.*;

public class Fortune {
    public static void main(String[]args){
        System.out.println("ようこそ占いの館へ");

        System.out.print("あなたの名前を入力してください>");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("年齢は＞");
        int age = sc.nextInt();
        

        int fortune = new java.util.Random().nextInt(4);
        
        
        System.out.println(fortune);
        
        System.out.println("占いの結果が出ました");
        System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
        System.out.println("1:大吉、２：中吉、３：吉、４：凶");

    }

}
