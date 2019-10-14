package interviewProgramsonStrings;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

//1) How to find the maximum occurring character in given String? (solution)

public class StringRepeated {

	public static void main(String[] args) {
		HashMap<String,Integer> al=new HashMap<String,Integer>();
		String name="java";
		char[] k=name.toCharArray();
		Arrays.sort(k);
		for(int i=0;i<k.length;i++) {
			int counter=1;
			for(int j=i+1;j<k.length;j++) {
				if(k[i]==k[j]) {
					counter++;
				}
			}
			char c=k[i];
			String ad=Character.toString(c);
			al.put(ad, counter);
			i=i+counter-1;
			
		}
		
		System.out.println(al);
		HashMap<Integer,String> l=new HashMap<Integer,String>();
		Set<String> m=al.keySet();
	Iterator<String> h=	m.iterator();
	while(h.hasNext()) {
		String s=h.next();
		Integer a=al.get(s);
		l.put(a, s);
	}
	
	System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
