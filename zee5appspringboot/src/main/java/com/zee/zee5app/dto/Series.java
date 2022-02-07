package com.zee.zee5app.dto;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "trailer")}, name="series")
public class Series {
	
	@Id
	@Size(min=6)
	private String seriesId;
	@NotBlank
	private String seriesName;
	@NotNull
	private String release_date;
	@NotBlank
	private String trailer;
	@NotBlank
	private String language;
//	@NotBlank
	private String cast;
	@NotBlank
	private String genre;
	@Max(value = 70)
	private int age_limit;
	@Min(value = 1)
	private int noOfEpisodes;
	
	@OneToMany(mappedBy = "series" , cascade = CascadeType.ALL)
	private List<Episode> episodes = new ArrayList<>();
	
}
