import java.util.Scanner;
public class Sample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char a = scan.next().charAt(0);
        int i = (int)a;
        int character;
        if(i>=65 && i<=90)
        {
                character = i+32;
                System.out.printf(a+" -> %c",character);
        }
        else if(i>=97 && i<=122)
        {
                character =i-32;
                System.out.printf(a+" -> %c",character);
        }
    }
}
