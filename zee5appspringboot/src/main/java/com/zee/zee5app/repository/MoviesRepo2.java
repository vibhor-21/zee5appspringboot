package com.zee.zee5app.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.exception.IdNotFoundException;


@Repository
public interface MovieRepository extends JpaRepository<Movies, String> {

}
