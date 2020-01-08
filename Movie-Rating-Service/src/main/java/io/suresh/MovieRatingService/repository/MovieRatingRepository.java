/**
 * 
 */
package io.suresh.MovieRatingService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.suresh.MovieRatingService.model.Rating;

/**
 * @author Suresh
 *
 */
@Repository
public interface MovieRatingRepository extends CrudRepository<Rating, String> {
	
	public Iterable<Rating>  findAllByUserId(String userID);
	

}
