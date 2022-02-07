package com.zee.zee5app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.zee5app.dto.Series;

public interface SeriesRepository extends JpaRepository<Series, String> {

	Optional<Series> findBySeriesNameAndLanguage(String seriesName, String language);
}
