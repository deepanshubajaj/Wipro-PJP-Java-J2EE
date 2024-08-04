import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r=0,sum=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
