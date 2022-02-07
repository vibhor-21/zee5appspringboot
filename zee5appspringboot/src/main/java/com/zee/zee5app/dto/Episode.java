package com.zee.zee5app.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "episodeName")},  name = "episodes")
public class Episode {

	@Id
	@Size(min = 6)
	private String episodeId;
	
	@NotBlank
	private String episodeName;
	@Min(value = 5)
	private String episodeLength;
	@NotBlank
	private String location;
	@NotBlank
	private String trailer;
	
	@ManyToOne
	//this episode table should have fk.seriesId
	@JoinColumn(name= "seriesId")
	private Series series; //series id nd col act as FK
}
