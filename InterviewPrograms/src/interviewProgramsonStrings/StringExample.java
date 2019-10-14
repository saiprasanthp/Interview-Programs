package interviewProgramsonStrings;

public class StringExample {

	public static void main(String[] args) {
		String s="sai";
		String s3=null;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a') {
				 s3=s.replace(c , 'l');
			}
		}
		System.out.println(s3);
	} 
}