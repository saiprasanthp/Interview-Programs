package interviewProgramsonStrings;
//16. How to find top two numbers from an integer array? (solution)

public class TopTwoNumbers {

	public static void main(String[] args) {
		int input [] = {10, 5, 3, 4, 3, 5, 6};
		int temp;
		for(int i=0;i<input.length;i++) {
			
			for(int j=i+1;j<input.length;j++) {
				
				if(input[i]<input[j]) {
					
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		for(int i=0;i<=1;i++) {
			System.out.println(input[i]);
		}

	}

}
