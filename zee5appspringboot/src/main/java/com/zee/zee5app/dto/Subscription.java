package com.zee.zee5app.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subscription")
public class Subscription {
	
	@Id
	@Column(name = "subId")
	private String id;
	@NotBlank
	private String type;
	@NotNull
	private String date_Of_Purchase;
	@NotBlank
	private String status;
	@NotBlank
	private String pack_Country;
	@NotBlank
	private String payment_Mode;
	@NotBlank
	private String autoRenewal;
	@NotNull
	private String expiry_Date;
	@NotNull
	private int amount;

	private BigDecimal contactNo;
	
	
	@ManyToOne
	@JoinColumn(name = "regId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Register register;
}
