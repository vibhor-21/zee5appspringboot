package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.SeriesRepository;
import com.zee.zee5app.service.SeriesService;
@Service

public class SeriesServiceImpl implements SeriesService {

	@Autowired
	private SeriesRepository seriesRepository;

	@Override
	public String addSeries(Series series) {
		// TODO Auto-generated method stub
		Series series2 = seriesRepository.save(series);
		if(series2!=null)
			return "success";
		return "fail";
	}

	@Override
	public Series[] getAllSeries() {
		// TODO Auto-generated method stub
		List<Series> series = seriesRepository.findAll();
		return series.toArray(new Series[series.size()]);
	}

	@Override
	public Optional<Series> getSeriesById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return seriesRepository.findById(id);
	}

	@Override
	public String deleteSeries(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Series> optional = this.getSeriesById(id);
		if(optional.isEmpty()) {
			return "record not found";
		}else {
			seriesRepository.deleteById(id);
			return "success";
		}
	}

	@Override
	public String modifySeries(String id, Series series) {
		// TODO Auto-generated method stub
		if(this.seriesRepository.existsById(id)==false)
			return "fail";
		return (this.seriesRepository.save(series)!=null)?"success":"fail";
	}
	

}
