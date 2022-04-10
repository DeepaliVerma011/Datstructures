import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ans=0;
        int pos=1;
        while(n!=0){
            int digit=n%10;
            ans+=(pos*Math.pow(10,digit-1));
            n=n/10;
            pos++;
        }
        System.out.println(ans);
    }
}
