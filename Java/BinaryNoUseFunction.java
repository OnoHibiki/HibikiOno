import java.util.Scanner;

class BinaryNoUseFunction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("２進数にしたい整数を入力してね");
        int ten = sc.nextInt();
        sc.close();/*一応閉じとこうね */
        

        String binary ="";/*２進数をString型で格納するために */
        int n = ten;/*これがないと、最後の出力のtenがおかしくなるよ */

        if(n == 0) {
            binary = "0";/*このif文がないと０入力時空白が出力されてしまうの */
        }else{
            while(n > 0){
            binary = (n % 2) + binary ;/*10→２進数の基本的な変換方法 */
            n = n / 2 ;

            }
            
        }
        System.out.println("10進数"+ten+"の時:2進数"+binary);
    }
}