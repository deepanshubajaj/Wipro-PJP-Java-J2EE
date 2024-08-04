import java.util.Scanner;
public class A10 {
    
    static int Even(int x)
    {
        if(x%2==0)
            return 2;
        return 1;
    }
    
    public static void main(String args[]) {
      
        int x,y=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to Check: ");
        x=scan.nextInt();
        y=Even(x);
        if(y==2)
            System.out.print("EVEN");
        else
            System.out.print("ODD");
    
      }
}