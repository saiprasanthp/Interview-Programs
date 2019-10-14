package interviewProgramsonStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int[] j= {1,2,3,4,3,2,1,1,1};
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<j.length;i++) {
			if(hash.containsKey(j[i])) {
				hash.put(j[i], hash.get(j[i])+1);
			}else {
				hash.put(j[i], 1);
			}
		}
		System.out.println(hash);
		Set<Integer> se=hash.keySet();
		Iterator<Integer> itr=se.iterator();
		while(itr.hasNext()) {
			Integer in=itr.next();
			Integer itnt=hash.get(in);
			if(itnt>=1) {
				System.out.println(in+"  "+""+"occurance"+hash.get(in)); 
			}
		}
	}
}


