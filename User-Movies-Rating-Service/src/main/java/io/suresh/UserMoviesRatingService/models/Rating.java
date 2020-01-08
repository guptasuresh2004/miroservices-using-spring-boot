/**
 * 
 */
package io.suresh.UserMoviesRatingService.models;

/**
 * @author Suresh
 *
 */

public class Rating {


	String movieId;
	String UserId;
	int userrating;
	 public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public Rating(String userId,String movieId, int userrating) {
			super();
			this.UserId = userId;
			this.movieId = movieId;
			this.userrating = userrating;
		}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getUserrating() {
		return userrating;
	}
	public void setUserrating(int userrating) {
		this.userrating = userrating;
	}
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", userrating=" + userrating + "]";
	}
	

}
