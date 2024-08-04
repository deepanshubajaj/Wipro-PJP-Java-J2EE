import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter string : ");
                String str = scan.nextLine();
                str = str.substring(1, str.length() - 1);
            	System.out.println(str);
	    }

}