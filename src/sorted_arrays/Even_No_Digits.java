package sorted_arrays;

import java.util.Arrays;

public class Even_No_Digits {

	public static void main(String[] args) {
		int[] input = {12, 345, 24, 6, 7896};
		System.out.println(findNumbers(input));
		//System.out.println(Arrays.toString(findNumbers(input)));
	}
	
	static int findNumbers(int[] input) {
		int evenCount=0;
		for(int i=0; i<input.length; i++) {
			if(numofDigits(input[i])%2==0) evenCount++;
		}
		return evenCount;
	}

	 static int numofDigits2(int num) {
		  int c=0;
		while(num>0) {
			num = num/10;
			c = c+1;
		}
		return c;
	}
//kunal's method :
	 static int numofDigits(int num) {
		  return (int)(Math.log10(num))+1;
	 }
}
