import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    
    public int findPassword(int input1, int input2, int input3, int input4, int input5){
        //Read only region end
        //Write code here...
        int sumofstable=0;
        int sumofunstable=0;
        if(isStable(input1))
            sumofstable+=input1;
        else
            sumofunstable+=input1;
        if(isStable(input2))
            sumofstable+=input2;
        else
            sumofunstable+=input2;
        if(isStable(input3))
            sumofstable+=input3;
        else
            sumofunstable+=input3;
        if(isStable(input4))
            sumofstable+=input4;
        else
            sumofunstable+=input4;
        if(isStable(input5))
            sumofstable+=input5;
        else
            sumofunstable+=input5;
        return sumofstable-sumofunstable;
    }
    public static boolean isStable(int num) {
        boolean isStable = true;
        int freq[]=new int[10];
        String numstr=String.valueOf(num);
        for(int i-0; i<numstr.length();i++){
             freq[Integer.parseInt(String.valueof(numstr.charAt(i)))]++;
        }
        int ffreq=0;
        for(int i=0;i<10;i++){
             if(freq[i]>0) {
                    ffreq=freq[i];
                    break;
             }
        }
        for(int i=0;i<10;i++) {
             if(freq[i]!=0 && req[i]!=ffreq){
                    isStablle=false;
                    break;
                
             }
        }
        return isStable;
    }
}
