import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n,i;
        System.out.println("Enter size of an array: ");
        n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("Character based on ASCII values are:");
        for (i = 0; i < n; i++) {
            System.out.print((char)arr[i] + " ");
        }
        System.out.println();
    }
}
