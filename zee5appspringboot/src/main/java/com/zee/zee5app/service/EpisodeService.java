package com.zee.zee5app.service;

import java.util.Optional;

import com.zee.zee5app.dto.Episode;
import com.zee.zee5app.exception.IdNotFoundException;

public interface EpisodeService {

	public String addEpisode(Episode episode);
	public Episode[] getAllSeries();
	public Optional<Episode> getEpisodeById(String id) throws IdNotFoundException;
	public String deleteEpisode(String id) throws IdNotFoundException;
	public String modifyEpisode(String id, Episode episode);
}
