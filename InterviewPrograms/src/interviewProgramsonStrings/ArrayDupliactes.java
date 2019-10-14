package interviewProgramsonStrings;

import java.util.Arrays;

public class ArrayDupliactes {

	public static void main(String[] args) {
		int[] a= {10,2,5,7,4,2,10,3};
		Arrays.sort(a);//2,2,3,4,5,7,10,10
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
		}

	}

}
