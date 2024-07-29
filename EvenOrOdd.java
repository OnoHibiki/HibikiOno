import java.util.Scanner ;

class EvenOrOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("好きな整数を入力して。奇数か偶数か判断するから");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        
            sc.close();

        }
    }
}