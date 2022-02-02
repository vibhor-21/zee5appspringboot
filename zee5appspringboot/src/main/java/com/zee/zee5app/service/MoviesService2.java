package com.zee.zee5app.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.exception.IdNotFoundException;
@Service
public interface MoviesService2 {

	public String addMovies(Movies movie);
	public Movies[] getAllMovies();
	public Optional<Movies> getMoviesById(String id) throws IdNotFoundException;
	public String deleteMovies(String id) throws IdNotFoundException;
	public String modifyMovies(String id, Movies movie);
}
