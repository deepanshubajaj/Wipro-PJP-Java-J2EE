import java.util.*;
public class Sample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any character : ");
        char a = scan.next().charAt(0);
        int c=(int)a;
        if((c>=65 && c<=90) || (c>=97 && c<=122))
                System.out.println("Alphabhet");
        else if(c>=48 && c<=57)
                System.out.println("Digit");
        else
                System.out.println("Special Character");
    }
}