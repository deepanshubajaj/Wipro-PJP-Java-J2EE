import java.util.Scanner;
public class Sample {
    static int x,y,sum;
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n,flag=0,i;
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
        for(i=0;i<n;i++)
        {
            if(arr[i]==7)
                    x=i;
            else if(arr[i]==6)
                    y=i;
        }
        if(x<y)
        {
            for(i=0;i<n;i++)
                    sum=sum+arr[i];
        }
        else
        {
            for(i=0;i<n;i++)
            {
                    if(arr[i]==6)
                    {
                            flag=1;
                    }
                    else if(arr[i]==7)
                    {
                            flag=0;
                    }
                    else if(flag==0)
                    {
                            sum=sum+arr[i];
                    }
            }
        }

        System.out.println(sum);
 
    }
}
