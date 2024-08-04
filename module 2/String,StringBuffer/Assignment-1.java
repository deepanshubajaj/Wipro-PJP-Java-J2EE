import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the string : ");
                String str = scan.nextLine();
                StringBuffer buffer = new StringBuffer(str);
                buffer.reverse();
                String data = buffer.toString();
                if(str.equals(data)){
                                System.out.println("Given String is palindrome");
                } 
                else {
                                System.out.println("Given String is not palindrome");
                }
        }
}