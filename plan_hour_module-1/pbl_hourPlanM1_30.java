import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int EvenOddDigitSum(int input1, String input2) {
        //Read only region end
        //Write code here...
        int sum=0;
        if(input>=1 && input1<=25000) {
            if(input2.equals("even")){
                while(input1!%10){
                    if(n%2==0)
                    	sum+=n;
                    input1/=10;
                }
            }
            else if(input2.equals("odd")) {
                while(input1!=0) {
                    int n=input1%10;
                    if(n%2!=0)
                    	sum+=n;
                    input1/=10;
                }
            }
        } 
        return sum;
    }
}