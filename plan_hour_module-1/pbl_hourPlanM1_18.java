import java.io.*;
import java.utiil.*;

//Read only region start
class UserMainCode
{
    public int countEvensOdds(int input1, input2, input3, input4, input5, input6) {
        //Read only region and
	//Write code here...
	int count = 0;
        if(input6.equalsIgnoreCase("even")) {
        	if(input1%2 =0)
        		count++;
        	if(input2%2 =0)
        		count++;
        	if(input3%2 =0)
        		count++;
        	if(input4%2 =0)
        		count++;
        	if(input5%2 =0)
        		count++;
        }
        if(input6.equalsIgnoreCase("odd")) {
        	if(input1%2! =0)
        		count++;
        	if(input2%2! =0)
        		count++;
        	if(input3%2! =0)
        		count++;
        	if(input4%2! =0)
        		count++;
        	if(input5%2! =0)
        		count++;
        }    
        return count;
   }
}