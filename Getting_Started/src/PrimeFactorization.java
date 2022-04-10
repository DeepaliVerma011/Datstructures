import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int fac=2;fac*fac<=n;fac++){
            while(n%fac==0){
                System.out.print(fac+" ");
                n=n/fac;
            }
        }

        if(n!=1){
            System.out.print(n);
        }
    }
}
