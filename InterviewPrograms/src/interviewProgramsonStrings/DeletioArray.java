package interviewProgramsonStrings;

public class DeletioArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,1,3};
		int[] count=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i]==arr[j]) {
					
				}else {
					count[i]=arr[i];
					
				}
			}
		}
		for(int l:count) {
			System.out.println(l);
		}

	}

}
