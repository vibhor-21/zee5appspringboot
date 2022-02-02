package com.zee.zee5app.dto;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "movieName")},name="movies")
public class Movies {
//	private String Name;
//	private String release_date;
//	private String trailer;
//	private String language;
//	private String[] cast;
//	private long length;
//	private String id;
	@Id
	@Column(name="movieid")
	private String id;
	
	@NotBlank
	private String movieName;
	
	@NotBlank
	private String language;
	
	@NotBlank
	@Max(value=70)
	private int agelimit;
	@NotBlank
	private String genere;
	@NotNull
	private BigDecimal length;
	@NotNull
	private Date releasedate;

	@NotBlank
	private String trailer;
	@NotBlank
	private String cast;
	
}
