import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode {
    
    public int isMultiple(int input1,int input2) {
      
        //Read only region and
        //Write code here...
        if(input1==0 || input2==0)
                return 3;
        else if(input2%input1==0 || input1%input2==0)
                return 2;
        return 1;
            
        
      }
}