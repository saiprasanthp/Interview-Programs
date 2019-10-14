package interviewProgramsonStrings;

public class AddingArray {

	public static void main(String[] args) {
		int[] a= {10,2};
		m1(a);

	}
	public static void m1(int[] k) {
		int[] ll=new int[3];
		int j=0;
		int counter=0;
		for(int i=0;i<k.length;i++) {
			if(k[i]==2) {
				ll[j]=30;
				counter++;
				j++;
				
			}else {
				ll[j]=k[i];
				j++;
			}
			if(counter>0) {
				ll[j]=k[i];
			}
		}
		for(int kk:ll) {
			System.out.println(kk);
		}
	}

}
