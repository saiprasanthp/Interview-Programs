package interviewProgramsonStrings;
//How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number - Java Solution
//ans=9
public class ArraysInterview {

	public static void main(String[] args) {
	int[] a=	{2, 6, 3, 9, 11};
	
	for(int i=0;i<a.length-1;i++) {
		
		if(a[i]+a[i+1]==9) {
			System.out.println(a[i] +" "+a[i+1]);
		}
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==9) {
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}
	
	

	}

}

