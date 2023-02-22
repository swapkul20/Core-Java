package com.techlabs.serialization;
import java.io.*;
public class SerializationTest {

	public static void main(String[] args) {
		try
		{
		Student s1=new Student(10,"AAA",75.5);
		FileOutputStream fos=new FileOutputStream("D:\\files/f3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("Object written successfully");
		oos.close();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
