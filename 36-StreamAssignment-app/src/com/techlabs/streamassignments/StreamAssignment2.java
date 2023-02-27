package com.techlabs.streamassignments;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamAssignment2 {

	public static void main(String[] args) {
		try
		{
		FileReader reader=new FileReader("D:\\files/studentnames.txt");
		System.out.println("Using File Reader");
		Scanner scanner=new Scanner(reader);
		while(scanner.hasNextLine())
		{
		   System.out.println(scanner.nextLine());
		}
		
		System.out.println("Using Stream");
		Stream<String> filestream=Files.lines(Paths.get("D:\\files/studentnames.txt"));
		filestream.forEach(string->System.out.println(string));
		filestream.close();
		
		Files.readAllLines(Paths.get("D:\\files/studentnames.txt")).stream()
		.forEach(string->System.out.println(string));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
