import java.util.*;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 2 strings : ");
                String str1 = scan.nextLine();
                String str2 = scan.nextLine();
                StringBuffer sb = new StringBuffer();
        		while (str1.indexOf(str2) != -1) {	
		                	int index = str1.indexOf(str2);
                			if (index == 0 && index + str2.length() < str1.length() - 1) {
                			                    	sb.append(str1.charAt(index + str2.length()));
                				                    str1 = str1.replaceFirst(str2, "");
                			                    	continue;
                			}
                
                			if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
                			                    	sb.append(str1.charAt(index - 1));
                			                    	str1 = str1.replaceFirst(str2, "");
                			                     	continue;
                			}
                
                			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
                			                    	sb.append(str1.charAt(index - 1));
                			                    	sb.append(str1.charAt(index + str2.length()));
                			                    	str1 = str1.replaceFirst(str2, "");
                			}
                }

		        System.out.println(sb);
	    }

}