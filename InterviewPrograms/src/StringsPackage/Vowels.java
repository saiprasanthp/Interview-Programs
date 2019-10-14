package StringsPackage;
//7) How to count a number of vowels and consonants in a String? (solution)


public class Vowels {

	public static void main(String[] args) {
		char[] m= {'m','k','j','d','a','u'};
		char[] k= {'a','e','i','o','u'};
		String h="";
		int counter;

		for(int i=0;i<m.length;i++) {
			
			for(int j=0;j<k.length;j++) {
				
				if(m[i]==k[j]) {
					System.out.println(m[i]+" "+"it is vowel");
					break;
				}else {
					counter=1;
					if(h.contains(Character.toString(m[i]))) {
						counter++;
						
					}else {
						
						h=h+Character.toString(m[i]);
						System.out.println(m[i]+""+" it is not vowel"+""+counter);

					}
					
				}
			}
		}
		System.out.println(h);
		
		

	}

}
