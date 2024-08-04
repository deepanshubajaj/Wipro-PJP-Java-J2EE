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
        int max1,max2,min1,min2;
        max1=max2=arr[0];
        min1=min2=arr[n-1];
        for(i=0;i<n;i++){
            if(max1<arr[i]){
                    max2=max1;
                    max1=arr[i];
            }
            if(max2<arr[i] && arr[i]!=max1)
                    max2=arr[i];
            if(min1>arr[i]){
                    min2=min1;
                    min1=arr[i];
            }
            if(min2>arr[i] && arr[i]!=min1)
                    min2=arr[i];
        }

        System.out.println("maximum 1 and maximum 2 values of an array are : "+max1 +" and "+ max2 );
        System.out.println("minimum 1 and minimum 2 values of an array are : "+min1 +" and "+ min2 );
    }
}
