import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 2 strings : ");
                String a = scan.nextLine();
                String b = scan.nextLine();
                String bigger = a.length() > b.length() ? a : b;
		        String smaller = a.length() < b.length() ? a : b;
		        StringBuffer sb = new StringBuffer();
        		for (int i = 0; i < smaller.length(); i++) {
		                            	sb.append(a.charAt(i)).append(b.charAt(i));
	        	}
        		sb.append(bigger.substring(smaller.length(), bigger.length()));
        		System.out.println(sb);
	    }

}