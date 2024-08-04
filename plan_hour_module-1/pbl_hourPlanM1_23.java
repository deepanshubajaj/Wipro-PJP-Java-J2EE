import java.io.*;
import java.utiil.*;

//Read only region start
class UserMainCode
{
    public int countPrimesInRange(int input1, int input 2) {
	//Read only region and
	//Write code here...
	List<Integer> p= new ArrayList<>();
	for(int i=input1;i<input2;i++){
		boolean isP=true;
		for(int j =2; j<i,j++){
			if(i%j==0){
				isP=false;
				break;
			}
		}
		if(isP)
		   p.add(i);
	}
	return p.size();
    }
}    