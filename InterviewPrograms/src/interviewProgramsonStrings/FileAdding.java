package interviewProgramsonStrings;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class FileAdding {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("F:\\doc.txt");
		pw.write("sai");
		pw.write("jai");
		pw.append("ll");
		//pw.close();
		
	//	PrintWriter pw1=new PrintWriter("F:\\doc.txt");
		OutputStream out=new FileOutputStream("F:\\doc.txt",true);
		String s="hai";
		byte[] k=s.getBytes();
		pw.println();
		out.write(k);
		out.close();
	/*	PrintWriter pw1=new PrintWriter("F:\\doc.txt");
		pw1.append("kkkkk");
		pw1.close();
		
		
*/
		pw.close(); 
		
		FileWriter f=new FileWriter("F:\\doc.txt",true);
		f.write("jj");
		
		

		
		

	}

}
