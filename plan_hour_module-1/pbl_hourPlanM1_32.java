import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int isPalinNumPossible(int input1) {
        //Read only region end
        //Write code here...
        String str=Integer.toString(input1);
        int count[]=new int[25000];
        Arrays.fill(count,0);
        for(int i =0; i<str.length();i++)
            count[(int i)(str.charAt(i))]++;
        int odd=0;    
        for(int i=0;i<25000;i++) {
            if((count[i] & 1) == 1)
            	odd++;
	    if(odd>1)
            	return 1;
        }
        return 2;
           
    }
}