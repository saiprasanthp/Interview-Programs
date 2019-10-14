package interviewProgramsonStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {
		
	
		String[] s= {"java","sai","hi","java"};
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++) {
			if(hash.containsKey(s[i])) {
				hash.put(s[i], hash.get(s[i])+1);
			}else {
				hash.put(s[i], 1);
			}
		}
		
		Set<String> st=hash.keySet();
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			String name=it.next();
			Integer i=hash.get(name);
			if(i>1) {
				System.out.println(name +"  occurance "+hash.get(name));
			}
		}
	}

}
