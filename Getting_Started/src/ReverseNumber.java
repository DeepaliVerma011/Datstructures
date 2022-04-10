import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        while(a>0){
            int dig=a%10;
            System.out.println(dig);
            a=a/10;
        }
    }
}
