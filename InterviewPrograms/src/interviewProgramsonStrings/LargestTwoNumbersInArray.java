package interviewProgramsonStrings;

public class LargestTwoNumbersInArray {
	public static int[] m1(int[] arra) {
		int temp=0;
		 for(int i=0;i<arra.length;i++) {
			 for(int j=i+1;j<arra.length;j++) {
				 if(arra[i]<arra[j]) {
					 temp=arra[i];
					 arra[i]=arra[j];
					 arra[j]=temp;	 
				 }
			 }	
	}
		 return arra;
	}
	public static void m2(int[] arra1) { 
		for(int i=0;i<arra1.length;i++) {
			if(i<=1) {
				System.out.println(arra1[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arra= {30,20,3,40,2};
		int [] arra1=m1(arra);
		m2(arra1);
	}

}
