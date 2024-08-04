import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int a=scan.nextInt();
        int flag=0;
        if(a==0||a==1)
            flag=1;
        
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
               flag=1;
               break;
            }
        }
        if(flag==0)
                System.out.println("Prime");
        else
                System.out.println("Not a Prime");
    }
}
