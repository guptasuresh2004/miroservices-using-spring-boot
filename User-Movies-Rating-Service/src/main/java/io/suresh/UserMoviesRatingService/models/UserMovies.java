package io.suresh.UserMoviesRatingService.models;

import java.util.List;


public class UserMovies {

	public UserMovies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserMovies(String userId, List<String> movies_ids) {
		super();
		this.userId = userId;
		this.movies_ids = movies_ids;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public List<String> getMovies() {
		return movies_ids;
	}


	public void setMovies(List<Rating> movies) {
		this.movies_ids = movies_ids;
	}



	String userId;
	
	List<String> movies_ids;

}
