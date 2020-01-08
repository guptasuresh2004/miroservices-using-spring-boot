package io.suresh.MovieRatingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.suresh.MovieRatingService.model.Rating;
import io.suresh.MovieRatingService.service.MovieRatingService;

@RestController
@RequestMapping("/movie/rating")
public class MovieRequestController {
	@Autowired
	MovieRatingService movieRatingService;
	@RequestMapping("{movieId}")
	public Rating getRating(@PathVariable("movieId")  String movieId) {
		//return new Rating("suresh","testMovie",5);
		return movieRatingService.getRating(movieId);
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Rating> getAllRating(){
		return (List<Rating>) movieRatingService.getAllRating();
		
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/user/{userId}")
	public List<Rating> getAllRatingOfUser(@PathVariable("userId") String userId){
		return (List<Rating>) movieRatingService.getAllRatingOfUser(userId);
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addRating(@RequestBody Rating rating) {
		
		movieRatingService.addRating(rating);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateRating(@RequestBody Rating rating) {
		
		movieRatingService.updateRating(rating);;
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteRating(@RequestBody Rating rating) {
		
		movieRatingService.deleteRating(rating);
		
	}

}
