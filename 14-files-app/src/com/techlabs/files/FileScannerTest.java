package com.techlabs.files;
import java.io.*;
import java.util.Scanner;
public class FileScannerTest {

	public static void main(String[] args) {
		try
		{
		File f1=new File("D:\\files/f1.txt");
		Scanner sc1=new Scanner(f1);
		StringBuffer sb=new StringBuffer();
		while(sc1.hasNext())
		{
			sb.append(sc1.nextLine());
		}
		sc1.close();
		System.out.println(sb);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	

	}

}
