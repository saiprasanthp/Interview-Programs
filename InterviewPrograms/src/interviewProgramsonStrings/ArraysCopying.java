package interviewProgramsonStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArraysCopying {

	public static void main(String[] args) {
		TreeSet<Integer> al=new TreeSet<Integer>();
		int[] a= {1,2,3,1,4};//1,1,2,3,4      //0,1,2,3,4,7,8,9
		int[] b= {7,8,9,1,0};//0,1,7,8,9
		int[] k=new int[a.length];
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				al.add(a[i]);
				al.add(b[j]);
			}
		}
		
		/*for(int l:k) {
			System.out.println(l);
		}*/
		System.out.println(al);

	}

}
