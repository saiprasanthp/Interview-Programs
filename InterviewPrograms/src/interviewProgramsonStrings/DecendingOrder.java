package interviewProgramsonStrings;

import java.util.Arrays;

public class DecendingOrder {

	public static void main(String[] args) {
		int[] data= {1,2,3,4,4,1,1};
		Arrays.sort(data);
		int temp;
		int j1=0;
		int[] data1=new int[data.length];
		for(int fir=0;fir<data.length-1;fir++) {
			if(data[fir]!=data[fir+1]) {
				data1[j1]=data[fir];
				j1++;
				
			}
		}
		data1[j1]=data[data.length-1];

		for(int i=0;i<data1.length;i++) {
			for(int j=i+1;j<data1.length;j++) {
				if(data1[i]<data1[j]) {
					temp=data1[i];
					data1[i]=data1[j];
					data1[j]=temp;	
				}
			}
		}
		for(int store:data1) {
			if(store==0) {
				continue;
			}
			System.out.println(store);
		}
	}
}
