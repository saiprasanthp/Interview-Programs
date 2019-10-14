package FileConcept;

import java.io.File;

public class FileExists {

	public static void main(String[] args) {
		File n=new File("C:\\Users\\user\\Desktop");
	/*	if(n.exists()) {
			
			System.out.println("created");
		}else {
			System.out.println(" exists");
		}*/
	File[]  kk=	n.listFiles();
	for(File g:kk) {
		
		
		String name=g.getName();
		if(name.contains("Documents")) {
			System.out.println(name);
			System.out.println("contains");
			break;
		}
		System.out.println(g);
	}
		
	

	}

}
