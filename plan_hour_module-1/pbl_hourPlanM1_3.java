import java.util.Scanner;
public class A3 {
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number to check: " );
      int x=scan.nextInt();
      if(x%2==0)
            System.out.println("Even");
        
      else
            System.out.println("Odd");
    
      }
}