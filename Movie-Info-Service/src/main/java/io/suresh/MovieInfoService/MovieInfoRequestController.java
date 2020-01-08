package io.suresh.MovieInfoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.suresh.MovieInfoService.models.Movie;
import io.suresh.MovieInfoService.services.MovieInfoService;

@RestController
@RequestMapping("/movie")
public class MovieInfoRequestController {
	@Autowired
	MovieInfoService movieInfoService;
	@RequestMapping("{movieId}")
	public Movie getMovie(@PathVariable("movieId")  String movieId) {
		//return new Rating("default",5);
		return movieInfoService.getMovie(movieId);
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Movie> getAllMovie(){
		return (List<Movie>) movieInfoService.getAllMovies();
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addMovie(@RequestBody Movie mv) {
		
		movieInfoService.addMovie(mv);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateMovie(@RequestBody Movie mv) {
		
		movieInfoService.updateMovie(mv);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteMovie(@RequestBody Movie mv) {
		
		movieInfoService.deleteMovie(mv);
		
	}

}
