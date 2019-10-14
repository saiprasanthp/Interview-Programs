package interviewProgramsonStrings;

import java.util.Arrays;

//6.   How to find repeated numbers in an array if it contains multiple duplicates? (solution)


public class MultipleDuplicates {

	public static void main(String[] args) {
		int[] a= {1,4,3,2,6,7,1,3};
		MultipleDuplicates.	m1(a);

	}
	public static void m1(int[] a) {
		
		Arrays.sort(a); //1,1,2,3,3,4,6,7
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
		}
	}

}
