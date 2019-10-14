package interviewProgramsonStrings;
/*//13 How to find common elements in three sorted array? (solution)
Now we are coming on territory of tough array questions. Given three 
arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

input1 = {1, 5, 10, 20, 40, 80}
input2 = {6, 7, 20, 80, 100}
input3 = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80*/
public class ElementsIn3Arrays {

	public static void main(String[] args) {
	int[]	input1 = {1, 5, 10, 20, 40, 80};
	int[]	input2 = {6, 7, 20, 80, 100};
	int[]	input3 = {3, 4, 15, 20, 30, 70, 80, 120};
	
	for(int i=0;i<input1.length;i++) {
		
		int counter=1;
		for(int j=0;j<input2.length;j++) {
			int count=1;
			for(int k=0;k<input3.length;k++) {
				if(input1[i]==input2[j]) {
					System.out.println(input1[i]);
					counter++;
					break;
				}else if(input1[i]==input3[k]) {
					System.out.println(input1[i]);
					count++;
					break;
					
				}
			}
			if(counter>1) {
				break;
			}
			if(count>1) {
				break;
			}
			
		}
	}
		

	}

}
