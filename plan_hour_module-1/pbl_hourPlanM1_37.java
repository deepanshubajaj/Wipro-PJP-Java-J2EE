import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int weightOfString(String input1, String input2) {
        //Read only region end
        //Write code here...
        String str=input1.toUpperCase();
        int sum=0;
        for(int i=0;i<input1.length();i++){
            if(input2==0){
                if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || !Character.isLetter(str.charAt(i))){
                    continue;
                }
                else{
		    int a=str.charAt(i)-64;
		    sum+=a;
		}
	    }	                    
            else{
	
		if(!Character.isLetter(str.charAt(i)))
                    continue;
                else{
                        int a=str.charAt(i)-64;
			sum+=a;
                }
            }
      	}
      	return sum;
    }
    
}