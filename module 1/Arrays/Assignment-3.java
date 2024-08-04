import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n,element,i,flag=0;
        System.out.println("Enter size of an array: ");
        n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("Enter the number to be searched in an array: ");
        element=scan.nextInt();
        for(i=0;i<n;i++){
            if(element==arr[i]){
               System.out.println("Index value of the given number: "+i); 
               flag=1;
               break;
            }
        }
        if(flag==0)
            System.out.println(-1);
    }
}
