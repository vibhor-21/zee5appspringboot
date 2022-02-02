package com.zee.zee5app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.exception.IdNotFoundException;

@Repository
public interface SeriesRepository extends JpaRepository<Series, String> {

}
