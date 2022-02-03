package com.zee.zee5app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
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
	@NotBlank
	private int contactNo;
	@NotBlank
	private String regId;
	
}
