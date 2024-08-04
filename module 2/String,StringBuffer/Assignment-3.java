import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter string : ");
                String str = scan.nextLine();
                int n = str.length();
        		String repeater = "";
        		if (n < 2) 
        		        repeater = str;
        		else 
        		        repeater = str.substring(0, 2);
        		String output = "";
        		for (int i = 0; i < n; i++) {
            			output += repeater;
        		}
        		System.out.println(output);

	    }

}