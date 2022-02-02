package com.zee.zee5app.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data

@AllArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "seriesname")},name="series")
public class Series {
//	private String Name;
//	private String release_date;
//	private String trailer;
//	private String language;
//	private String[] cast;
//	private long length;
//	private String id;
	public Series() {
		// TODO Auto-generated constructor stub
	}
	
	//@Setter(value=AccessLevel.NONE)
	@NotBlank
//	@UniqueConstraint
	private String seriesName;
	
	
	//@Setter(value=AccessLevel.NONE)
	@NotBlank
	private String language;
	
	@Setter(value=AccessLevel.NONE)
	@Id
	@Column(name="seriesid")
	@NotBlank
	private String seriesid;
	
	@NotNull
	@Max(value=70)
	private int agelimit;
	@NotBlank
	private String cast;
	@NotBlank
	private String genere;	
	
	@NotNull
	@Min(value=1)
	private int noOfEpisodes;
	@NotBlank
	private String trailer;
	@NotNull
	private Date releasedate;
}
