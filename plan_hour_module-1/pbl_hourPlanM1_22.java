import java.io.*;
import java.utiil.*;

//Read only region start
class UserMainCode
{
    public int nthPrime(int input1) {
	//Read only region and
	//Write code here...       
	int c=0,num=2,i=0,flag=0;
	while(c!=input1) {
		  int count = 0;
                  for (int i=2, i<=Math.sqrt(num);i++){
          		if(num%1==0) {
				count++;
				break;
       			}
		  }
		  if (count == 0) {
	                c++;
			flag=num; 
		  }
 		  num++; 
	}
	return flag;  
    }
}
