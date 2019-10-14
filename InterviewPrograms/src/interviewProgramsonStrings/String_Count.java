package interviewProgramsonStrings;

public class String_Count {

	public static void main(String[] args) {
		String g="            hello world";
		int counter=0;
		int k=0;
		String h=g.trim();
		for(int i=0;i<h.length();i++) {
			 k=counter++;
		}
		System.out.println(k);
	}
}