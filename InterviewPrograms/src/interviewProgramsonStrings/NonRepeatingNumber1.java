package interviewProgramsonStrings;
//3) How to program to print first non repeated character from String? (solution)


public class NonRepeatingNumber1 {

	public static void main(String[] args) {
		String name="Morning";    //ans=M
		char[] k=	name.toCharArray();
		String n="";
		int counter=0;
		int l=0;
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {

				if(k[i]==k[j]) {
					counter++;	
				}else {
					if(n.contains(Character.toString(k[i]))) {
						counter++;	
					}else {
						n=n+k[i];
					}

				}
			}
		}
		char b=	n.charAt(l);
		System.out.println(b);




	}

}
