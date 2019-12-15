package org.in.co;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.text.Utilities;

public class Defined {

	public static void main(String[] args) throws IOException
	{
		/*File d=new File("E:\\add\\jkk\\fdf\\fhv.txt");
		Boolean b=d.canWrite();
		System.out.println(b);
		

	*/
		// to display all the lists of files
		
	//	File d=new File("E:\\add\\jkk\\");
	//	Fileutils.write(d,"sg");
		/*File[]l=d.listFiles();
		for(File s:l)
		{
			System.out.println(s);
	*/}
		// to print all the list 
	File d=new File("E:\\add\\jkk\\");
	 String[] l=d.list();
	 {
	 for(String s:l)
		 
	 {
		 System.out.println(s);
	 }
	 
	 
		 
	 
	
	
		

	
		
		
	

}
}

	

