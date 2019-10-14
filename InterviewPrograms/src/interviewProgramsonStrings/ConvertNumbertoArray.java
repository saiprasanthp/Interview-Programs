package interviewProgramsonStrings;

public class ConvertNumbertoArray {

	public static void main(String[] args) {
		
		int[] h= {111,121};
		String[] sp=null;
		for(int i=0;i<h.length;i++) {
			Integer j=h[i];
			String splt=j.toString();
			sp=splt.split("");
			for(int k=0;k<sp.length;k++) {
				System.out.println(sp[k]);
			}
		}
	}

}
