/**
 * 
 */
package io.suresh.MovieRatingService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Suresh
 *
 */
@Entity
@Table(name="MovieRating") 
public class Rating {
	@Id
	String movieId;
	String userId;
	int userrating;
	 public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public Rating(String userId,String movieId, int userrating) {
			super();
			this.userId=userId;
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
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", userrating=" + userrating + "]";
	}
	

}
