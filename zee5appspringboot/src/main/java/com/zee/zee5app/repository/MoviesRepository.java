package com.zee.zee5app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.zee5app.dto.Movies;

public interface MoviesRepository extends JpaRepository<Movies, String> {
	
	
	// find to retrive and exists to boolean result
	
	Optional<Movies> findByMovieNameAndLanguage(String movieName, String language);
	
	Optional<Movies> findByMovieName(String movieName);
	
//	Optional<Movies> findByMovieNameAndRelease_date(String movieName, String release_date);
//
//	Optional<Movies> findByCast(String cast);

}
