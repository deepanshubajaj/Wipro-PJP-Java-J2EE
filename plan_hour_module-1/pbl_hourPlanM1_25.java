import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int uniqueDigitsCount(int input1) {
        //Read only region end
        //Write code here...
        HashSet<Integer> has = new Hashset<Integer>();
        int count=0;
        if(input1==0)
            count =1;
        else {
            while(input1>=1 && input1<=25000) {
                hash.add(input1%10);
                input1/ =10;
            }
            count=hash.size();
        }
        return count;
    }
}