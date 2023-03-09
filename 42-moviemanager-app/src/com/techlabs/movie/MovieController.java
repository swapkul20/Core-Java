package com.techlabs.movie;

import java.io.IOException;
import java.util.Scanner;

public class MovieController {
	MovieManager manager;

	public MovieController() throws Exception {
		
		manager=new MovieManager();
	}
	public void start() throws Exception
	{
		int choice=0;
		Scanner sc=new Scanner(System.in);
		while(choice<8)
		{
			displayMenu();
		System.out.println("Enter Your Choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter Movie ID:");
		       int id=sc.nextInt();
		       System.out.println("Enter Movie Name:");
		       String name=sc.next();
		       System.out.println("Enter Release Year:");
		       int year=sc.nextInt();
		       System.out.println("Enter Movie Genre:ACTION/DRAMA/THRILLER/COMEDY/ROMANCE");
		       Genre genre=Genre.valueOf(sc.next().toUpperCase());
			   manager.addMovie(new Movie(id,name,year,genre));
			   break;
		case 2:System.out.println(manager.getMovies());
		       break;
		case 3:System.out.println("Enter Movie ID");
		       id=sc.nextInt();
		       manager.getMovieById(id);
		       break;
		case 4:manager.clearMovies();
		       break;
		case 5:System.out.println("Enter Movie ID");
	           id=sc.nextInt();
	           manager.deleteMovieById(id);
	           break;
		case 6:System.out.println("Enter Movie Genre:ACTION/DRAMA/THRILLER/COMEDY/ROMANCE");
		       genre=Genre.valueOf(sc.next().toUpperCase());
		       manager.getMoviesByGenre(genre);
		       break;
		case 7: manager.getMoviesOrderByGenre();
		case 8:System.exit(0);
	    default:System.out.println("Wrong Input");
	            break;
		}
		
		}
	}
	public void displayMenu()
	{
		System.out.println("1. Add Movie");
		System.out.println("2. Get Movies");
		System.out.println("3. Get Movie by ID");
		System.out.println("4. Clear Movies");	
		System.out.println("5. Delete Movie By ID");
		System.out.println("6. Get Movie by Genre");
		System.out.println("7. Get Movie Order by Genre");
		System.out.println("8. Exit");
	}

}
