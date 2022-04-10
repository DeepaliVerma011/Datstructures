import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new  Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int gcd=0;
//int min=Math.min(n1,n2);
        //for(int i=min/2; i>=1;i--)
        for(int i=1;i<n1 && i<n2;i++)
        {
            // Checks if i is factor of both integers
            if(n1%i==0 && n2%i==0)
                gcd =i;
        }
        System.out.println(gcd);

        int lcm=(n1*n2)/gcd;
        System.out.println(lcm);

    }
}

