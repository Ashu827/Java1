package com.ashu.collection.movie;

public class Movie_Details {

	String movieName;
	String leadActor;
	String leadActoress;
	String genre;
	public Movie_Details(String movieName, String leadActor,
			String leadActoress, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActoress = leadActoress;
		this.genre = genre;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActoress() {
		return leadActoress;
	}
	public void setLeadActoress(String leadActoress) {
		this.leadActoress = leadActoress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie_Details [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActoress=" + leadActoress + ", genre="
				+ genre + "]";
	}
	
	
	
	
	
}
