package com.zee.zee5app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "login")

public class Login {
	
	@Id
	@Column(name = "userName")
	private String userName;
	@NotBlank
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY)
//	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@JoinColumn(name = "regId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Register regId;
}
