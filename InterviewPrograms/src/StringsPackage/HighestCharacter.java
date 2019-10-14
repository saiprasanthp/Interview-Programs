package StringsPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//17) How to return highest occurred character in a String? (solution)


public class HighestCharacter {

	public static void main(String[] args) {
		SortedMap<Integer,Character> tree= new TreeMap<Integer,Character>(); 
		String name="Welcome good morning";
		char[] l=name.toCharArray();
		Arrays.sort(l);
		String j="";
		for(int i=0;i<name.length();i++) {
			j=j.concat(Character.toString(l[i]));
		}
		j=j.trim();
		System.out.println(j);

		char[] p= 		j.toCharArray();
		HashMap<Character,Integer> has=new HashMap<Character,Integer>();
		for(int i=0;i<p.length;i++) {
			if(has.containsKey(p[i])) {
				has.put(p[i], has.get(p[i])+1);
			}else {
				has.put(p[i], 1);
			}


		}
		System.out.println(has);
		Set<Character> m=	has.keySet();
		Iterator<Character> it=	m.iterator();
		while(it.hasNext()) {
			Character k=it.next();
			Integer ii=has.get(k);
			tree.put(ii,k);
		}
		System.out.println(tree);
		Set<Integer> ll=		tree.keySet();
		Iterator<Integer> oo=ll.iterator();
		while(oo.hasNext()) {
			Integer a=oo.next();
		}
		Integer k=tree.lastKey();
		System.out.println(tree.get(k));
	}

}
