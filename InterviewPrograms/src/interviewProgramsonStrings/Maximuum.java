package interviewProgramsonStrings;

public class Maximuum {

	public static void main(String[] args) {
		int[] k= {1,2,10,3,4,9,10};
		int max=0;
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
				if(k[i]>k[j]) {
					max=k[i];
				}
			}
		}
		System.out.println(max);

	}

}
