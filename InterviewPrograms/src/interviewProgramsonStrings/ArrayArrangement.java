package interviewProgramsonStrings;

import java.util.ArrayList;

public class ArrayArrangement {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		boolean b=false;
		int[] a= {1,2,3,4,5,1,1,3};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			int counter=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					counter++;
				}
					if(al.contains(a[i])) {
						b=true;
						break;
					}
				}
			
				
			
			if(b) {
				break;
			}
			System.out.println(a[i]+" "+counter);
		}
	

	}

}
