package com.zee.zee5app.service;

import java.util.Optional;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.exception.IdNotFoundException;

public interface SeriesService {
	
	public String addSeries(Series series);
	public Series[] getAllSeries();
	public Optional<Series> getSeriesById(String id) throws IdNotFoundException;
	public String deleteSeries(String id) throws IdNotFoundException;
	public String modifySeries(String id, Series series);
}
