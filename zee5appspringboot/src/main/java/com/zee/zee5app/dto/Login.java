package com.zee.zee5app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="login")
public class Login {
	
	@Id
	@Column(name="username")
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	@NotBlank
	private String regId;
	@NotBlank
	private ROLE role;
}
