package StringsPackage;

public class Vowels1 {

	public static void main(String[] args) {
		String name1="aeiou";
		String j="kiloae";
		
		for(int i=0;i<j.length();i++) {
			if(name1.contains(Character.toString(j.charAt(i)))){
				System.out.println(j.charAt(i)+"it is vowel");
				//break;
			}else {
				System.out.println(j.charAt(i)+"it is not vowel");
			}
		}

	}

}
