import java.util.Scanner;

public class PytharoasTriplet {
    public static void main(String[] args) {
        //   Write your code here
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if((a*a==b*b+c*c) || (b*b==c*c+a*a) || (c*c==a*a+b*b)){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
