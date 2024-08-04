import java.util.*;
public class ControlStatement1{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=scan.nextInt();
        if(a>0)
            System.out.println("Positive");
        else if(a<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        
    }
}