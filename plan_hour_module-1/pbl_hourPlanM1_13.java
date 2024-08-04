import java.util.Scanner;
public class A13 {
    
    static int SecondLastDigit(int x)
    {
        x=x/10;
        if(x>0) 
            return x%10;
        else if(x==0)
            return -1;
        return -1*x%10;
    }
    
    public static void main(String args[]) {
      
        int x;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        x=scan.nextInt();
        System.out.print(SecondLastDigit(x));
        
      }
}