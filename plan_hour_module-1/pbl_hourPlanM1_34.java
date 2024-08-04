import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int totalHillWeight(int input1, int input2, int input3) {
        //Read only region end
        //Write code here...
        int sum=0;
	for(int i=0; i<input1;i++){
	    for(int j=0;j<=i;j++)
	    	sum+=input2;
	    input2+=input3;
	}
	return sum;
    }
}
		