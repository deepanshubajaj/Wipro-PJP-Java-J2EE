import java.util.Scanner;
public class A14 {
    
    static int addLastDigits(int input1, int input2)
    {
        return Math.abs((input1%10)) + Math.abs((input2%10));
    }
    
    public static void main(String args[]) {
      
        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        a=scan.nextInt();
        System.out.println("Enter the number 2 : ");
        b=scan.nextInt();
        System.out.print("Sum of the last two digits is : "+addLastDigits(a,b));
        
      }
}