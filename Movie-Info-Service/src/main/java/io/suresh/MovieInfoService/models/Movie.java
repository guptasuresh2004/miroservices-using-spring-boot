package io.suresh.MovieInfoService.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieId, String movieName, String movieDescription, int movieReleseYear) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.movieReleseYear = movieReleseYear;
	}
	@Id
	String movieId ;
	String movieName;

	String movieDescription;

	int movieReleseYear;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public int getMovieReleseYear() {
		return movieReleseYear;
	}

	public void setMovieReleseYear(int movieReleseYear) {
		this.movieReleseYear = movieReleseYear;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDescription=" + movieDescription
				+ ", movieReleseYear=" + movieReleseYear + "]";
	}



}
