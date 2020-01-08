package io.suresh.UserMoviesRatingService.models;

import java.util.List;

public class AllUserRating {
	
	
	public AllUserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Rating> getAllRating() {
		return allRating;
	}

	public void setAllRating(List<Rating> allRating) {
		this.allRating = allRating;
	}

	List<Rating> allRating;

}
