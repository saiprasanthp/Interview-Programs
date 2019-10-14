package interviewProgramsonStrings;

import java.util.Comparator;
import java.util.TreeSet;
class Com implements Comparator<Object>{
	
	public int compare(Object obj1,Object obj2) {
		
		Character h1=(Character)obj1;
		Character h2=(Character)obj2;
		return -h1.compareTo(h2);
	}
}
public class String_conversion {

	public static void main(String[] args) {
		Com kk=new Com();
		TreeSet<Character> b=new TreeSet<Character>(kk);
		String name="sai";
		char[] get_char=name.toCharArray();
		for(int i=0;i<get_char.length;i++) {
			b.add(get_char[i]);
		}
		System.out.println(b);
		}
	} 