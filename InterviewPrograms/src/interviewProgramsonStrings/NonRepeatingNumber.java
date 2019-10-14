package interviewProgramsonStrings;
//15. How to find first non-repeating element in array of integers? (solution)
public class NonRepeatingNumber {

	public static void main(String[] args) {
		int input [] = {10, 5, 3, 4, 3, 5, 6};
		for(int i=0;i<input.length-1;i++) {
			if(input[i]==input[i+1]) {
				System.out.println("repeated");
			}else {
				System.out.println(input[i]);
				break;
			}
		}


	}

}
