package com.zee.zee5app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.SeriesRepository;
import com.zee.zee5app.service.SeriesService;

public class SeriesServiceImpl implements SeriesService {

	@Autowired
	private SeriesRepository seriesRepo;
	
	
	@Override
	public String addSeries(Series series) {
		// TODO Auto-generated method stub
		return this.seriesRepo.addSeries(series);
	}

	@Override
	public Series[] getAllSeries() {
		// TODO Auto-generated method stub
		return this.seriesRepo.getAllSeries();
	}

	@Override
	public Optional<Series> getSeriesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return this.seriesRepo.getSeriesById(id);
	}

	@Override
	public String deleteSeries(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return this.seriesRepo.deleteSeries(id);
	}

	@Override
	public String modifySeries(String id, Series series) {
		// TODO Auto-generated method stub
		return null;
	}

}
