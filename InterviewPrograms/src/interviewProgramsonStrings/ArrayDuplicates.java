package interviewProgramsonStrings;

import java.util.Arrays;

public class ArrayDuplicates {

	public static void main(String[] args) {
		
		int[] dup= {1,2,9,3,4,1,2,2,3};
		Arrays.sort(dup);
		int[] normal=new int[dup.length];
		int j=0;
		for(int i=0;i<dup.length-1;i++) {
			
			if(dup[i]!=dup[i+1]) {
				normal[j]=dup[i];
				j++;
			}
		}
		normal[j]=dup[dup.length-1];
		for(int result:normal) {
			if(result==0) {
				continue;
			}
			System.out.println(result);
		}
	}

}
