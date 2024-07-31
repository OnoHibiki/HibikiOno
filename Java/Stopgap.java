import java.util.Scanner;

class Stopgap{
    public static void main(String[] args){
        System.out.println("何か入力して。それに鉤括弧つけます");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println("「"+a+"」");

        sc.close();
    }
}