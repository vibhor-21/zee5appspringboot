package com.zee.zee5app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movies")

public class Movies {
	
	@Id
	@Column(name = "movieId")
	private String id;
	@NotBlank
	private String movieName;
	@NotNull
	private String release_date;
	@Lob   //to hold binary types content
	private String trailer; //byte[]
	@NotBlank
	private String language;
	@NotBlank
	private String cast;
	@Max(value=70)
	private int age_limit;
	@NotBlank
	private String genre;
	
}
