package interviewProgramsonStrings;
//4) How to remove characters from the first String which are present in the second String? (solution)

import java.util.Arrays;

public class TwoStrings {

	public static void main(String[] args) {
		String a="";
		String name="java";
		String name1="kav";
char[] p=	name.toCharArray();
char[] f=name1.toCharArray();
for(int i=0;i<p.length;i++) {
	
	for(int j=0;j<f.length;j++) {
		if(p[i]==f[j]) {
			
		}
	}
	a=a+p[i];
}
System.out.println(a);
		
	}
}
