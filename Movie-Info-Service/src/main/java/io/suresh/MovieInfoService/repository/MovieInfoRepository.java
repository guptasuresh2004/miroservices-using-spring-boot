/**
 * 
 */
package io.suresh.MovieInfoService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.suresh.MovieInfoService.models.Movie;

/**
 * @author Suresh
 *
 */
@Repository
public interface MovieInfoRepository extends CrudRepository<Movie, String> {

}
