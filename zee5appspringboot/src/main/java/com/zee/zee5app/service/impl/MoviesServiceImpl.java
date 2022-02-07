package com.zee.zee5app.service.impl;

import java.util.List;
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
	public Movies addMovies(Movies movie) {
		// TODO Auto-generated method stub
		Movies movie2 = moviesRepository.save(movie);
		if(movie2!=null)
			return movie2;
		else
			return null;
	}

	@Override
	public Movies[] getAllMovies() {
		// TODO Auto-generated method stub
		List<Movies> movies = this.moviesRepository.findAll();
		return movies.toArray(new Movies[movies.size()]);
	}

	@Override
	public Optional<Movies> getMoviesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return moviesRepository.findById(id);
	}

	@Override
	public String deleteMovies(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Movies> optional = this.getMoviesById(id);
		if(optional.isEmpty()) {
			return "record not found";
		}else {
			moviesRepository.deleteById(id);
			return "success";
		}
	}

	@Override
	public String modifyMovies(String id, Movies movie) {
		// TODO Auto-generated method stub
		if(!this.moviesRepository.existsById(id))
			return "fail";
		return (this.moviesRepository.save(movie)!=null)?"success":"fail";
	}
	
	

}
