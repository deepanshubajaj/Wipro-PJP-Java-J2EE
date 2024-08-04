import java.io*;
import java.util.*;

//Read only region start
class UserMainCode{
    public int digitSum(int input1) {
            //Read only region end
            //Write code here...
            int sum=0;
            if(input1>0){
                while(input1>0 || sum>9){
                    if(input1==0){
                        input1=sum;
                        sum=0;
                    }
                    sum+=input1%10;
                    input1/=10;
            }
            return sum;
        }
        else{
            while(Math.abs(input1)>0 || sum>9){
                    if(Math.abs(input1)==0){
                        input1=sum;
                        sum=0;
                    }
                    sum+=Math.abs(input1)%10;
                    input1/=10;
            }
            return -1*sum;
        }
    }
}