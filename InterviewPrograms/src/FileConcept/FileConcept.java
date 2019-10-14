package FileConcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FileConcept {
	public static BufferedReader bf;
	public static String line;
	public static String[] lines;
	public int i=0;
	public static LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
	public static FileWriter fi;
	public static Scanner sc;
	public  static String marks;
	
	public LinkedHashMap<String,String> file_Read() {
		try {
			 bf=new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\InterviewPrograms\\Files\\marks.txt"));
			try {
				line=	bf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(line!=null) {
		lines=	line.split(":");
		map.put(lines[i], lines[i+1]);
		
		try {
			line=bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		return map;
		
	}

	public static void main(String[] args) {
		FileConcept j=new FileConcept();
		LinkedHashMap<String,String> added=j.file_Read();
		System.out.println(added);
		 sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		if(added.containsKey(name)) {
			System.out.println("yes it exists");
			String val=added.get(name);
			System.out.println(val);
		}else {
			try {
				 fi=new FileWriter("C:\\Users\\user\\eclipse-workspace\\InterviewPrograms\\Files\\marks.txt",true);
				 System.out.println("enter marks");
				 marks=sc.next();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fi.write(name+":"+marks);
				System.out.println("succesfull");
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	
		
		

	}

}
