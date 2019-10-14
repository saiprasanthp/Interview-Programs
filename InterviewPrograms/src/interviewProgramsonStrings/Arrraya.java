package interviewProgramsonStrings;

public class Arrraya {

	public static void main(String[] args) {
		int[] k= {1,2,3,4,5,6,7,1,8};
		int[] l=new int[10];
		for(int i=0;i<k.length-1;i++) {
			for(int j=i+1;j<k.length-1;j++) {
				if(k[i]==k[j]) {
					System.out.println("duplicate values"+k[j]);
					//break;
				}
				else {
					l[i]=k[i];
				
				}
				
				
			}
		}
		for(int m:l) {
			System.out.println(m);
		}

	}

}
