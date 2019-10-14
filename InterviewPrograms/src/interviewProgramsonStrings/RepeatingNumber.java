package interviewProgramsonStrings;

import java.util.Arrays;

/*14. How find the first repeating element in an array of integers? (solution)
Given an array of integers, find the first repeating element in it.
We need to find the element that occurs more than once and whose index
of the first occurrence is smallest.

Examples:

Input:  input [] = {10, 5, 3, 4, 3, 5, 6}*/
//Output: 5 [5 is the first element that repeats]
public class RepeatingNumber {

	public static void main(String[] args) {
		int  input [] = {10, 5, 3, 4, 3, 5, 6};
		
		for(int i=0;i<input.length-1;i++) {
			int counter=0;
			for(int j=i+1;j<input.length;j++) {	
				if(input[i]==input[j]) {
					System.out.println(input[i]);
					counter++;
					break;
				}
			}
			if(counter>=1) {
				break;
			}
		}
		


	}

}
