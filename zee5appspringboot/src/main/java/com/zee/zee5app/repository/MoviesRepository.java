package com.zee.zee5app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.zee5app.dto.Movies;

public interface MoviesRepository extends JpaRepository<Movies, String> {

}
