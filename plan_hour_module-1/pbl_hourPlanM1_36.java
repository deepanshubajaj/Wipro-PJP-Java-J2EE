import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int isPalindrome(String input1) {
        //Read only region end
        //Write code here...
        String str=input1.toLowerCase();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
            str1+=str.charAt(i);
        if(str.equals(str1))
        	return 2;
        return 1;
    }
}