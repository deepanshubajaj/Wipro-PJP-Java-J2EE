import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    
    public int sumOfNonPrimeIndexxValues(int[] input1, int[] input2){
        //Read only region end
        //Write code here...
     	int sum = 0;
     	for(int i=0;i<input2;i++) {
         	if(!isPrime(i)) {
            		 sum+=input1[i];
         	}
     	}
     	return sum;
    }
    public static boolean isPrime(int n){
        if(1==n || 0==n)
               return false;
        for(int i=2; i<n;i++) {
               if(i==n)
                    continue;
               if(n%i==0){
                    return false;
               }
         }
         return true;
    }
}
