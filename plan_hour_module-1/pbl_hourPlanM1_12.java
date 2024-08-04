import java.util.Scanner;
public class A12 {
    
    static int LastDigit(int x)
    {
        if(x>0)
            return x%10;
        return -1*x%10;
    }
    
    public static void main(String args[]) {
      
        int x;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        x=scan.nextInt();
        System.out.print(LastDigit(x));
        
      }
}