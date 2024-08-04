import java.util.*;
public class ControlStatementEvenOdd {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter number : ");
       int a= scan.nextInt();
       if(a%2==0)
            System.out.println("Even");
       else
            System.out.println("Odd");
    }
}
