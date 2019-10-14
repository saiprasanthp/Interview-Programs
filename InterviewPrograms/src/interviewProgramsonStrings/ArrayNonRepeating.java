package interviewProgramsonStrings;

public class ArrayNonRepeating {

	public static void main(String[] args) {
	int[] a=	{1, 1, 2, 2, 3, 4, 4, 5, 5};
	boolean b=false;
	
	for(int i=0;i<a.length;i++) {
		int counter=1;

		for(int j=i+1;j<=a.length-1;j++) {
			
			if(a[i]%a[j]==0) {
				counter++;
				break;
			}else {
				b=true;
			}
			
		}
		if(b) {
			System.out.println(a[i]);
			break;
		}
		i=i+counter-1;
		
	
	}


	}

}
