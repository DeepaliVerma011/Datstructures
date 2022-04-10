import java.util.Scanner;

public class PrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int low=scan.nextInt();
        int high=scan.nextInt();

        while(low<=high){
            if(isPrime(low)==true){
                System.out.println(low);
            }
            low++;
        }
    }

    public static boolean isPrime(int a){
        for(int i=2;i*i<=a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
}
