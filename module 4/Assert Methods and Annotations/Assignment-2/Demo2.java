package junit_3;

public class Demo2 {
	
	public boolean palindromeCheck(String str) {
	StringBuffer sb=new StringBuffer(str);  
	sb.reverse();
	String str1=sb.toString();  
	if(str.equals(str1))
        return true;
     else
        return false;
	}
}
