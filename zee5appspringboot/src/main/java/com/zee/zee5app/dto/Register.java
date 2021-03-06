package com.zee.zee5app.dto;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity //entity class
//ORM mapping purpose
//snake case
@Table(name = "register")

public class Register implements Comparable<Register> {
	
	@Id //it will consider this column as PK
	@Column(name = "regId")
	private String id;
	
	@Size(max=50)
	@NotBlank
	private String firstName;
	
	@Size(max=50)
	@NotBlank
	private String lastName;
	
	@Size(max=50)
	@Email
	private String email;
	
	@Size(max=100)
	@NotBlank
	private String password;
	
	@NotNull
	private BigDecimal contactNumber;
	
	@Override
	public int compareTo(Register o) {
		return o.id.compareTo(this.getId());
	}
	
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(name ="user_roles", joinColumns = @JoinColumn(name="regId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private Set<Role> roles = new HashSet<>();
	
	@OneToMany(mappedBy = "register" , cascade = CascadeType.ALL)
	private List<Subscription> subscriptions = new ArrayList<>();
	
	@OneToOne(mappedBy = "regId", cascade = CascadeType.ALL)
//	@JsonIgnore
	private Login login;
	
}
