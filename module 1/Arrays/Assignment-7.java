import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n,temp=0,i;
        System.out.println("Enter size of an array: ");
        n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("The elements in the array are:");
        for(i = 0; i < n ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        for(i=0; i<n ; i++){
            for(int j=i+1;j<n;j++){
                        if(arr[i]>arr[j])
                        {
                                    temp=arr[i];
                                    arr[i]=arr[j];
                                    arr[j]=temp;
                        }
            }
        }
        // Now removing duplicates
        if (n!=0 || n!=1){ 
            
            int[] temp1 = new int[n];  
            int j = 0;  
            for (i=0; i<n-1; i++){  
                if (arr[i] != arr[i+1]){  
                    temp1[j++] = arr[i];  
                }  
             }  
            temp1[j++] = arr[n-1];     
            // Changing original array  
            for (i=0; i<j; i++){  
                arr[i] = temp1[i];  
            }  
            n=j;  
            System.out.println("The elements in the array after removing Duplicates are:");
            for(i = 0; i < n ; i++)
                System.out.print(arr[i]+" ");
        }
 
    }
}
