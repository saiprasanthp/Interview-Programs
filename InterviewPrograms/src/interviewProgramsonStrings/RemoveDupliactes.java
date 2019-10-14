package interviewProgramsonStrings;
//7. Write a program to remove duplicates from array in Java? (solution)

import java.util.Arrays;

public class RemoveDupliactes {

	public static void main(String[] args) {
		
		int[] a= {1,4,5,6,8,1,3};  //1,1,3,4,5,6,8
		Arrays.sort(a);
		int[] b=new int[a.length];
		int j=0;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
		}
		b[j]=a[a.length-1];
		for(int l:b) {
			if(l==0) {
				continue;
			}
			System.out.println(l);
		}

	}

}
