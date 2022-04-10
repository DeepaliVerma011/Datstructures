import java.util.Scanner;

public class FibonnaciTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=N;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }

    }
}
