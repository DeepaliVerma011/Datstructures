import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}
