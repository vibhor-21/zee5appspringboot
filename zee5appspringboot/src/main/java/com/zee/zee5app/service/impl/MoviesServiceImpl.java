package com.zee.zee5app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.MovieRepository;
import com.zee.zee5app.service.MoviesService2;

public class MoviesServiceImpl implements MoviesService2 {

	@Autowired
	private MovieRepository movieRepository;
	
	
	
	
	@Override
	public String addMovies(Movies movie) {
		// TODO Auto-generated method stub
		return this.movieRepository.addMovies(movie);
	}

	@Override
	public Movies[] getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.getAllMovies();
	}

	@Override
	public Optional<Movies> getMoviesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return movieRepository.getMoviesById(id);
	}

	@Override
	public String deleteMovies(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return movieRepository.deleteMovies(id);
	}

	@Override
	public String modifyMovies(String id, Movies movie) {
		// TODO Auto-generated method stub
		return null;
	}

}
