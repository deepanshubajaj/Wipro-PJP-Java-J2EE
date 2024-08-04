import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode {

	public int nnGenerator(String input1){
		// Read only region end
		// Write code here...
		String mobile_No = input1;
		StringBuilder numbiarNo = new StringBuilder();

		for (int i = 0; i < mobile_No.length(); i++) {
			int firstDigit = Integer.parseInt(String.valueOf(mobile_No.charAt(i)));
			int firstDigitEvenOrOdd = firstDigit % 2 == 0 ? 0 : 1; // even=0; odd=1
			int sum = firstDigit;
			int j = i + 1;

			if (j == mobile_No.length()) {
				numbiarNo.append(firstDigit);
				break;
			}

			while (true) {
				sum += Integer.parseInt(String.valueOf(mobile_No.charAt(j++)));

				if (sum % 2 != firstDigitEvenOrOdd || j >= mobile_No.length()) {
					numbiarNo.append(sum);
					i = j - 1;
					break;
				}
			}
		}

		return Integer.parseInt(numbiarNo.toString());
	}
} 