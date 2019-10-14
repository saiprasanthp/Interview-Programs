package interviewProgramsonStrings;

public class Checking_character_inString {

	public static void main(String[] args) {
		String s="hello who are you?";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='?') {
				System.out.println("done");
			}
		}
		
		if(s.contains(Character.toString('?'))) {
			System.out.println("have done");
		}
	}
}
