package interviewProgramsonStrings;

import java.util.Arrays;

public class StringDuplicates2 {

	public static void main(String[] args) {
		
		String name="my name is prasanth";
		String h="";
		int counter=0;
	char[] k=	name.toCharArray();
	Arrays.sort(k);
	for(int i=0;i<k.length;i++) {
		
		for(int j=i+1;j<k.length;j++) {
			
			if(k[i]==k[j]) {	
				if(h.contains(Character.toString(k[i]))) {
					counter++;
				}else {
				char d=	k[i];
			String a=	Character.toString(d);
			h=h.concat(a);
					
				}
			}
		}
	}
	System.out.println(h);

	}

}
