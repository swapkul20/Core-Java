package com.techlabs.files;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) throws IOException{
		try
		{
		FileInputStream fis=new FileInputStream("D:\\files/f1.txt");
		FileOutputStream fos=new FileOutputStream("D:\\files/f2.txt");
		int ch;
		while((ch=fis.read())!=-1)
		{
			fos.write(ch);
			
		}
		System.out.println("File copied successfully");
		fis.close();
		fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
