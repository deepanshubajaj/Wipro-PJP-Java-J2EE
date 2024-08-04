import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int aaDigitsCount(int input1) {
        //Read only region end
        //Write code here...
        int count=0;
        if(input1>=1 && input1<=25000){
            while(input1!=0) {
                input1/ =10;
                count++;
            }
        }
        return count;
    }
}