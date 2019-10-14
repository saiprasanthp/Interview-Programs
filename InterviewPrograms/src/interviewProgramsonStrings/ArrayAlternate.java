package interviewProgramsonStrings;

import java.util.ArrayList;

public class ArrayAlternate {

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		int[] b= {2,4,6,8,10};
		ArrayList al=new ArrayList();
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<=i;j++) {
				al.add(a[i]);
				al.add(b[j]);
			}
		}
		System.out.println(al);
	}
}
