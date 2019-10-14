package interviewProgramsonStrings;

public class String_Mumber {

	public static void main(String[] args) {
		String name="sai123";
		int counter=0;
		char[] j=name.toCharArray();
		for(int i=0;i<j.length;i++) {
	char c=		j[i];
	boolean b=Character.isDigit(c);
	if(b) {
		counter++;
	}else {
		System.out.println(j[i]);
	}		
		}
		

	}

}
