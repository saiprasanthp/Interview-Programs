package interviewProgramsonStrings;

import java.util.TreeSet;

public class String_Names_AlphabeticalOrder {

	public static void main(String[] args) {
		TreeSet<String> h=new TreeSet<String>();
		String[] str= {"sai","manoj","vijay","sravan"};
		for(int i=0;i<str.length;i++) {
			h.add(str[i]);
		
		}
		//System.out.println(h);
		
		
		String s="sai";
		char[] jj=s.toCharArray();
		for(int i=0;i<jj.length;i++) {
			for(int j=i+1;j<jj.length;j++) {
			char c1=jj[i];
			char c2=jj[j];
			String g1=Character.toString(c1);
			String g2=Character.toString(c2);
			int d=g1.compareTo(g2);
			System.out.println(d);
			}
/*			System.out.println(jj[i]);
 * 
*/		}
	}
}
