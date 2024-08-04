import java.util.Scanner;
public class A4 {
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the  1st number to check: " );
      int x=scan.nextInt();
      System.out.println("Enter the  2nd number to check: " );
      int y=scan.nextInt();
      if((x+y)%2==0)
            System.out.println("Sum is EVEN");
        
      else
            System.out.println("Sum is ODD");
    
      }
}