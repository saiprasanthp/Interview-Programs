package StringsPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

//19) Write a program to find the longest palindrome in a string? (solution)
class Rep implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=(String)arg0;
	Integer i1=	s1.length();
		String s2=(String)arg1;
		Integer i2=s2.length();
		return -i1.compareTo(i2);
	}
	
}

public class LongestPalindrom {

	public static void main(String[] args) {
		Rep l=new Rep();
		TreeSet<String> tt=new TreeSet<String>(l);
		String na="Write a program to find the longest palindrome in a string?";
		String[] kk=na.split(" ");
		for(int i=0;i<kk.length;i++) {
			tt.add(kk[i]);	
		}
		ArrayList<String> a=new ArrayList<String>(tt);
		for(int i=0;i<a.size();i++) {
		String h=a.get(i);
		System.out.println(h);
		break;
		}
	}

} 