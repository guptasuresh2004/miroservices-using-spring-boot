package io.suresh.UserMoviesRatingService.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.suresh.UserMoviesRatingService.models.AllUserRating;
import io.suresh.UserMoviesRatingService.models.Movie;
import io.suresh.UserMoviesRatingService.models.Rating;
import io.suresh.UserMoviesRatingService.models.UserMovies;
import io.suresh.UserMoviesRatingService.models.UserMoviesRating;
import io.suresh.UserMoviesRatingService.repository.UserMovieRatingRepository;
@Service
public class UserMovieRatingService {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	/*
	 * @Autowired UserMovieRatingRepository userMovieRatingRepository;
	 * 
	 * public UserMovies getUserMovies (String userId) { //return new
	 * Rating("ranbo", 4); return userMovieRatingRepository.findById(userId).get();
	 * }
	 * 
	 * public Iterable<UserMovies> getAllUserMovies () {
	 * 
	 * return userMovieRatingRepository.findAll(); } public void
	 * addUserMovies(UserMovies um) {
	 * 
	 * userMovieRatingRepository.save(um); }
	 * 
	 * public void updateUserMovies(UserMovies um) {
	 * 
	 * userMovieRatingRepository.save(um); } public void deleteUserMovies(UserMovies
	 * um) { userMovieRatingRepository.delete(um);
	 * 
	 * }
	 */
	public UserMoviesRating getUserMoviesRating (String userId) {
		
		
		
	Rating[] AllUserRating =  restTemplate.getForObject("http://movie-rating-service/movie/rating/user/" + userId, Rating[].class);
	
	    System.out.println("All user Ratings "+Arrays.asList(AllUserRating));
	    
	    List<Rating> ratingis =Arrays.asList(AllUserRating);
		
		List<Movie> userMoviesinfo=	ratingis.stream().map(rating-> {
			
			System.out.println("rating "+rating);
			
			Movie Movie = restTemplate.getForObject("http://movie-info-service/movie/" +rating.getMovieId(), Movie.class);
			Movie.setRating(rating.getUserrating());
			System.out.println("Movie is "+Movie);
			return Movie;
		}).collect(Collectors.toList());
		
		return new UserMoviesRating(userId,userMoviesinfo);
		
	}
	
	/*
	 * public UserMoviesRating getUserMoviesRating1 (String userId) { //return new
	 * Rating("ranbo", 4); UserMovies userMovies=
	 * userMovieRatingRepository.findById(userId).get(); List<Movie> userMoviesinfo
	 * =userMovies.getMovies().stream().map((movie_id)->{ //call web service get
	 * reting List<Rating> userRating = (List<Rating>)
	 * restTemplate.getForObject("http://movie-rating-service/movie/rating/user" +
	 * movie_id, Rating.class); Movie Movie =
	 * restTemplate.getForObject("http://movie-info-service/movie/rating/"
	 * +movie_id, Movie.class); Movie.setRating(userRating.getUserrating());
	 * 
	 * //call webservice get moview infor
	 * 
	 * //create new movie object and return return Movie; //return new
	 * Movie(rating.getMovieId(), "", "", 1900, userRating.getUserrating());
	 * 
	 * 
	 * }).collect(Collectors.toList());
	 * 
	 * return new UserMoviesRating(userId,userMoviesinfo); }
	 */

}
