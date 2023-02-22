package com.techlabs.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesrializationArrayTest {

	public static void main(String[] args) {
		try
		{
		FileInputStream fis=new FileInputStream("D:\\files/f4.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student students[]=(Student[])ois.readObject();
		System.out.println("RNO\tName\tPercentage");
		for(int i=0;i<students.length;i++)
		{
		System.out.println(students[i].getRno()+"\t"+students[i].getName()+"\t"+students[i].getPerc());
		
		}
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
