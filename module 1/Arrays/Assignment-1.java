import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n,sum=0,i;
        float average=0;
        System.out.println("Enter size of an array: ");
        n=scan.nextInt();;
        int []arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        average=(float)sum/n;
        System.out.println("Sum of an array: "+sum);
        System.out.println("Average of an array: "+average);
    }
}
