import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    
    public int digitRemove_Palin(int input 1){
        //Read only region end
        //Write code here...
     	StringBuilder num= new StringBuilder(String.valueOf(input1));
     	for(int i=0;i<num.length();i++) {
         	if(PC(num.toString()))
            		return -1;
            	char rc=num.charAt(i);
            	String newnum=num.deleteCharAt(i).toString();
            	if(PC(newnum)) {
                	return Integer.parseInt(String.valueOf(rc));
            	}
     	}
     	return -1;
    }
    public static boolean PC(string n) {
        n=n.totalLowerCase();
        int dc=n.length();
        boolean isP=true;
        int range=dc/2;
        if(dc%2==0)
                range--;
        for(int i =0; i<range;i++){
                if(n.charAt(i)!=n.charAt(dc-i-1))
        	        isP=false;
        }
        return isP;
    }
}
