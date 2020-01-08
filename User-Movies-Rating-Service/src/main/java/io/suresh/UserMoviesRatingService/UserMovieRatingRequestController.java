package io.suresh.UserMoviesRatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.suresh.UserMoviesRatingService.models.UserMoviesRating;
import io.suresh.UserMoviesRatingService.services.UserMovieRatingService;

@RestController
@RequestMapping("/user/movies")
public class UserMovieRatingRequestController {
	@Autowired
	UserMovieRatingService userMovieRatingService;
	
	/*
	 * @RequestMapping("{userId}") public UserMovies
	 * getUserMovies(@PathVariable("userId") String userId) {
	 * 
	 * return new UserMovies("suresh",Arrays.asList( "shole","diwar")); //return
	 * userMovieRatingService.getUserMovies(userId);new Rating("shole",5
	 * 
	 * }
	 */
		@RequestMapping("/rating/{userId}")
		public UserMoviesRating getUserMoviesRating(@PathVariable("userId")  String userId) {
			//return new Rating("default",5);
			return userMovieRatingService.getUserMoviesRating(userId);
			
		}
	
	/*
	 * @RequestMapping(method = RequestMethod.GET) public List<UserMovies>
	 * getAllUserMovies(){ return (List<UserMovies>)
	 * userMovieRatingService.getAllUserMovies();
	 * 
	 * }
	 * 
	 * @RequestMapping(method = RequestMethod.POST) public void
	 * addUserMovies(@RequestBody UserMovies um) {
	 * 
	 * userMovieRatingService.addUserMovies(um);
	 * 
	 * }
	 * 
	 * @RequestMapping(method = RequestMethod.PUT) public void
	 * updateUserMovies(@RequestBody UserMovies um) {
	 * 
	 * userMovieRatingService.updateUserMovies(um);
	 * 
	 * }
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE) public void
	 * deleteUserMovies(@RequestBody UserMovies um) {
	 * 
	 * userMovieRatingService.deleteUserMovies(um);
	 * 
	 * }
	 */
	 

}
