import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();

        //counting no of digits
        int temp=n;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        k=k%count;
        if(k<0){
            k=k+count;
        }
        int first=(int)(n/ (Math.pow(10,k)));
        int second=(int)(n% (Math.pow(10,k)));

        int ans= (int)((second* Math.pow(10,count-k))+first);
        System.out.println(ans);

    }
}
