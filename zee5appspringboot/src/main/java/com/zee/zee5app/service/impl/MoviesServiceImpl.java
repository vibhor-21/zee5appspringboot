package com.zee.zee5app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.MoviesRepository;
import com.zee.zee5app.service.MoviesService2;
@Service
public class MoviesServiceImpl implements MoviesService2 {
	
	@Autowired
	private MoviesRepository moviesRepository;

	@Override
	public String addMovies(Movies movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movies[] getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movies> getMoviesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteMovies(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifyMovies(String id, Movies movie) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
