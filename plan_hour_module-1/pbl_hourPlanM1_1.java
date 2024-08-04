import java.util.Scanner;
public class A1 {
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number to check: " );
      int x=scan.nextInt();
      if(x>0)
            System.out.println("Positive");
        
      else if(x<0)
            System.out.println("Negative");
    
      else
            System.out.println("Zero");
            
            
    }
}