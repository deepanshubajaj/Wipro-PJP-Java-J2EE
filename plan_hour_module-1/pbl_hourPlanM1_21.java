import java.io.*;
import java.utiil.*;

//Read only region start
class UserMainCode
{
    public int nthFibonacci(int input1) {
       //Read only region and
       //Write code here...
       int a=0, b=1, c=0;
       if (input1==0|| input1==1)
       		return a;
       else{
           	for (int i=2, i<=inpt1;i++){
           			c= a+b;
           			a=b;
           			b=c;
       }
       return c;
    }
}