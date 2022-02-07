package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Episode;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.EpisodeRepository;
import com.zee.zee5app.service.EpisodeService;
@Service
public class EpisodeServiceImpl implements EpisodeService {

	@Autowired
	private EpisodeRepository episodeRepository;
	@Override
	public String addEpisode(Episode episode) {
		// TODO Auto-generated method stub
		Episode episode1 = episodeRepository.save(episode);
		if(episode1!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public Episode[] getAllSeries() {
		// TODO Auto-generated method stub
		List<Episode> episodes = this.episodeRepository.findAll();
		return episodes.toArray(new Episode[episodes.size()]);
	}

	@Override
	public Optional<Episode> getEpisodeById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return episodeRepository.findById(id);
	}

	@Override
	public String deleteEpisode(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Episode> optional = this.getEpisodeById(id);
		if(optional.isEmpty()) {
			throw new IdNotFoundException("id not found");
		}
		else {
			episodeRepository.deleteById(id);
			return "success";
		}
	}

	@Override
	public String modifyEpisode(String id, Episode episode) {
		// TODO Auto-generated method stub
		if(!this.episodeRepository.existsById(id))
			return "fail";
		return (this.episodeRepository.save(episode)!=null)?"success":"fail";
	}

}
