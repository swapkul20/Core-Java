package com.techlabs.movie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieManager {
	private List<Movie> movies;
	private String filepath="D://files/movies.txt";
	public MovieManager() throws Exception
	{
		movies=new ArrayList<Movie>();
	    //loadMovies();	
	}
	public void saveMovies() throws IOException 
	{
		FileOutputStream fos=new FileOutputStream(filepath);
		ObjectOutputStream outputstream=new ObjectOutputStream(fos);
		for(Movie movie:movies)
			outputstream.writeObject(movie);
		outputstream.writeObject(null);
		System.out.println("Record saved");
		outputstream.close();
		
	}
	
	public void loadMovies() throws Exception
	{
		movies.clear();
		FileInputStream fis=new FileInputStream(filepath);
		ObjectInputStream inputstream=new ObjectInputStream(fis);
		Movie movie;
		while((movie=(Movie) inputstream.readObject())!=null)
			movies.add(movie);
		inputstream.close();
	}
	
	public void addMovie(Movie movie) throws IOException
	{
		movies.add(movie);
		saveMovies();
		
	}
	
	public void clearMovies() throws Exception
	{
		movies.clear();
		saveMovies();
	}
	public List<Movie> getMovies() throws Exception {
		loadMovies();
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public void getMovieById(int id)
	{
	   movies.stream().filter(movie->movie.getId()==id).forEach(movie->System.out.println(movie));
	}
	public void deleteMovieById(int id) throws Exception
	{
		for(Movie movie:movies)
		{
			if(movie.getId()==id)
			{
				movies.remove(movie);
				break;
			}
		}
		saveMovies();
	}
	public void getMoviesByGenre(Genre genre)
	{
		movies.stream().filter(movie->movie.getGenre()==genre).forEach(movie->System.out.println(movie));
	}
	
	public void getMoviesOrderByGenre()
	{
	  // movies.stream().forEach(movie->Collectors.toMap(movie.getGenre().toString(), movie.getName()));			
		
	}

	
}
