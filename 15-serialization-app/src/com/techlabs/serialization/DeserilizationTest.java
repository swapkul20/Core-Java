package com.techlabs.serialization;
import java.io.*;
public class DeserilizationTest {

	public static void main(String[] args) {
		try
		{
		FileInputStream fis=new FileInputStream("D:\\files/f3.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();
		System.out.println("Roll Number: "+s1.getRno());
		System.out.println("Name: "+s1.getName());
		System.out.println("Percentage: "+s1.getPerc());
		ois.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
