package interviewProgramsonStrings;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++) {
			int counter=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					counter++;
				}
			}
			if(counter==0) {
				System.out.println("prime number"+i);
			}else {
				System.out.println("not prime"+i);
			}
		}
	}

}