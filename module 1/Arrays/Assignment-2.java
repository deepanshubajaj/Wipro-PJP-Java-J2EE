import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n,max=0,min=0,i;
        System.out.println("Enter size of an array: ");
        n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(i=0;i<n;i++)
            arr[i]=scan.nextInt();
        max=min=arr[0];
        for(i=1;i<n;i++){
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Maximum element of an array: "+max);
        System.out.println("Minimum element of an array: "+min);
    }
}
