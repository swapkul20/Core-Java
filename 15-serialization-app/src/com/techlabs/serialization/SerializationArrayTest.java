package com.techlabs.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationArrayTest {

	public static void main(String[] args) {
		try
		{
		Student students[]= {new Student(1,"A",70), new Student(2,"B",80), new Student(3,"C",90)};
		
		FileOutputStream fos=new FileOutputStream("D:\\files/f4.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(students);
		System.out.println("Objects written successfully");
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
