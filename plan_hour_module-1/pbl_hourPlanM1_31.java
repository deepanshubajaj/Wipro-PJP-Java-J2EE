import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int isPalinNum(int input1) {
        //Read only region end
        //Write code here...
        int sum=0, r=0, temp=0, flag=1;
        temp=input1
        if(input>=1 && input1<=25000) {
            
                while(input1>0){
                    r=input1%10;
                    sum=(sum*10)+r;
                    input1/=10;
                }
                if(temp==sum)
                    flag=2;
                else
                    flag=1;
        }
	return flag;
           
    }
}