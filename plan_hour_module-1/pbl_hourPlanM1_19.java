import java.io.*;
import java.utiil.*;

//Read only region start
class UserMainCode
{
    public int isPrime(int input1) {
       //Read only region and
       //Write code here...
       int flag = 0;
       if (input1==1|| input1=0)
       flag = 0;
       else {
           for(int i=2; i<input1/2;i++)
            	if(input1%1==0){
                	flag =1;
                    	break;
       		}
       }
       if(flag==0)
            return 2;
        else
            return 1;
    }
}