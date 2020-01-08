package io.suresh.MovieInfoService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.suresh.MovieInfoService.models.Movie;
import io.suresh.MovieInfoService.repository.MovieInfoRepository;
@Service
public class MovieInfoService {
	@Autowired
	MovieInfoRepository movieInfoRepository;
	
	public Movie getMovie (String movieId) {
		//return new Rating("ranbo", 4);
		//return new Movie("SHOLE", "Shole", "Shole not by Ram Gopal", 1980);
		return movieInfoRepository.findById(movieId).get();
	}
	
	public Iterable<Movie> getAllMovies () {
	
		return movieInfoRepository.findAll();
	}
	public void addMovie(Movie mv) {
		
		movieInfoRepository.save(mv);
	}
	
	public void updateMovie(Movie mv) {
	
		movieInfoRepository.save(mv);
	}
	public void deleteMovie(Movie mv) {
		movieInfoRepository.delete(mv );
		
	}

}
