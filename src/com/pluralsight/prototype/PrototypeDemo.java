package com.pluralsight.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		// The cloning gives us a UNIQUE INSTANCE of the Movie object,
		// without using the keyword NEW !!!!
		// This is the definition of the prototype pattern,
		// meaning it is far lighter weight, not requiring new objects to be set
		// up each time.

		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational patterns in Java");

		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());

		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");

		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());

	}

}
