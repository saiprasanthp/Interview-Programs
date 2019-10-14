package interviewProgramsonStrings;

import java.util.Arrays;

public class javaDuplicates {

	public static void main(String[] args) {
		String name="javaaaasw";
		String a="";
		char[] div=name.toCharArray();
		Arrays.sort(div);
		for(int i=0;i<div.length-1;i++) {
			if(div[i]!=div[i+1]) {
				char c=div[i];
				String s=Character.toString(c);
				a=a+s;
			}
		}
		char g=div[div.length-1];
		Character.toString(g);
		a=a+g;
		System.out.println(a);
	}
}
