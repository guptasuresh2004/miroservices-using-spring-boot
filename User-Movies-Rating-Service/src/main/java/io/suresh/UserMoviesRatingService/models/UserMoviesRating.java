package io.suresh.UserMoviesRatingService.models;

import java.util.List;

public class UserMoviesRating {
	
	
	public UserMoviesRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserMoviesRating(String userId, List<Movie> userMovies) {
		super();
		this.userId = userId;
		this.userMovies = userMovies;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public List<Movie> getUserMovies() {
		return userMovies;
	}


	public void setUserMovies(List<Movie> userMovies) {
		this.userMovies = userMovies;
	}


	String userId;
	List<Movie> userMovies;
	
	

}
