import java.io*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public int nonRepeatDigitsCount(int input1) {
        //Read only region end
        //Write code here...
        int a[]= new int[25000];
        int count=0,rem=0;
        while(input>=1 && input1<=25000){
            rem=input1%10;
            a[rem]=++a[rem];
            input1=input1/10;
        }
            for(int i=0;i<25000;i++) {
                if(a[i]==1)
                    count++;
            }
        return count;
    }
}