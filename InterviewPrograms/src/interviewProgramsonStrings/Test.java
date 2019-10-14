package interviewProgramsonStrings;
interface I{
	public abstract void m3();
}
abstract class J{
	public abstract void m1();
	public void m2() {
		System.out.println("hi");
	}
}
class H extends J implements I{
	public void m1() {
		System.out.println("k");
		String n = null;
		if(n==null) {
			System.out.println("k");
		}
		int i=10;
		int h=10;
		if(i==h) {
			System.out.println("equals");
		}
		
	}
	public void m3() {
		
	}
}

public class Test {

	public static void main(String[] args) {
		H kk=new H();
		kk.m1();
		kk.m2();
	}

}