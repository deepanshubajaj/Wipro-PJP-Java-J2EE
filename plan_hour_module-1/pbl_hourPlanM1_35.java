import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
    public String secondWordUpperCase(String input1) {
        //Read only region end
        //Write code here...
        String strArray[]=input1.split("\\W+");
        String stt="LESS";
        if(strArray.length==1)
            return stt;
        return strArray[1].toUpperCase();
    }
}