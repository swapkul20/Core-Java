package com.techlabs.files;
import java.io.*;
public class FileTest {

	public static void main(String[] args) throws IOException{
		try
		{
		FileInputStream fis=new FileInputStream("D:\\files/f1.txt");
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
			
		}
		fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
