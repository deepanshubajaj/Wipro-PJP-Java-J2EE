import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    
    public int seriesN(int input1, int input2, int input3, int input4){
        //Read only region end
        //Write code here...
        int a =(input2-input1);
        int b =(input3-input2);
        int c=input1;
        for(int i =1;i<input4;i++) {
          if(i%2==1)
            c+=a;
          else
            c+=b;
        }
        return c;
    }
}
