import java.util.Scanner;
public class A11 {
    
    static int Odd(int x)
    {
        if(x%2!=0)
            return 2;
        return 1;
    }
    
    public static void main(String args[]) {
      
        int x,y=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to Check: ");
        x=scan.nextInt();
        y=Odd(x);
        if(y==1)
            System.out.print("EVEN");
        else
            System.out.print("ODD");
    
      }
}