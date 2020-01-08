package io.suresh.MovieRatingService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.suresh.MovieRatingService.model.Rating;
import io.suresh.MovieRatingService.repository.MovieRatingRepository;
@Service
public class MovieRatingService {
	@Autowired
	MovieRatingRepository movieRatingRepository;
	
	public Rating getRating (String movieId) {
		//return new Rating("ranbo", 4);
		return movieRatingRepository.findById(movieId).get();
	}
	
	public Iterable<Rating> getAllRating () {
	
		return movieRatingRepository.findAll();
	}
	
	public Iterable<Rating> getAllRatingOfUser (String userID) {
		
		return movieRatingRepository.findAllByUserId(userID);
	}
	public void addRating(Rating rt) {
		
		 movieRatingRepository.save(rt);
	}
	
	public void updateRating(Rating rt) {
	
		 movieRatingRepository.save(rt);
		
	}
	public void deleteRating(Rating rt) {
		movieRatingRepository.delete(rt );
		
	}
	

	
	

}
