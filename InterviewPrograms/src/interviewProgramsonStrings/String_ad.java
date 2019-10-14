package interviewProgramsonStrings;

import java.util.ArrayList;

public class String_ad {

	public static void main(String[] args) {
		String l="";
		ArrayList<String> kk=new ArrayList<String>();
		String s=new String("welcomepeople");
		ArrayList<String> al=new ArrayList<String>();
		String s1=s.substring(0, 7);
		int h=s1.length();
		String m=Integer.toString(h);
		String s2=s1.concat(m);
		kk.add(s1);
		kk.add(m);
		String a=s.substring(7);
		int q=a.length();
		String w=Integer.toString(q);
		String z=a.concat(w);
		kk.add(z);
		Object[] nn=kk.toArray();
		for(int i=0;i<nn.length;i++) {
			Object c=nn[i];
			String x=(String)c;
			l=l+x;
		}
		System.out.println(l);
	}
}
