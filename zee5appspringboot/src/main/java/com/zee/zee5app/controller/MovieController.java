package com.zee.zee5app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.service.MoviesService2;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	MoviesService2 movieService;
	@PostMapping("/addMovie")
	public ResponseEntity<?> addMovie(@RequestBody Movies movie){
		
		Movies result = movieService.addMovies(movie);
		return ResponseEntity.status(201).body(result);
	}
}
