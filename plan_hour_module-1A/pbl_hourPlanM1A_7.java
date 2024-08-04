import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode {

	public int sumOfPowerOfDigits(int input1){
		// Read only region end
		// Write code here...
		if (input1 <= 9) return 0;

		String num = String.valueOf(input1);
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			if (i == num.length() - 1) {
				sum += 1;
				
			} 
			else {
				sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))), Integer.parseInt(String.valueOf(num.charAt(i + 1))));
                
			}
		}

		return sum;
	}
}