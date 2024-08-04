import java.util.Scanner;
public class A2 {
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the  1st number to check: " );
      int x=scan.nextInt();
      System.out.println("Enter the  2nd number to check: " );
      int y=scan.nextInt();
      if(x>y)
            System.out.println(x+" Is Greater");
        
      else
            System.out.println(y+" Is Greater");
    
      }
}