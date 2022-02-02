package com.zee.zee5app.dto;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;

import com.zee.zee5app.exception.InvalidIdLengthException;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Subscription {
	
//	public Subscription(String type, String date_Of_Purchace, boolean status, String pack_Country, 
//			String payment_Mode, boolean autoRenewal, String expiry_Date, String id) {
//		super();
//		this.setType(type);
//		this.setDate_Of_Purchase(date_Of_Purchace);
//		this.setStatus(status);
//		this.setPack_Country(pack_Country);
//		this.setPayment_Mode(payment_Mode);
//		this.setAutoRenewal(autoRenewal);
//		this.setExpiry_Date(expiry_Date);
//		this.setId(id);
//	}
//	private String type;
//	private String date_Of_Purchase;
//	private boolean status;
//	private String pack_Country;
//	private String payment_Mode;
//	private boolean autoRenewal;
//	private String expiry_Date;
//	private String id;
	@NotBlank
	private String regid;
	

	@NotNull
	private int amount;
	
	@NotBlank
	private String type;
	
	@NotNull
	private Date dateofPurchase;
	
	@NotBlank
	private String status;
	
	@NotBlank
	private String paymentMode;
	
	@NotBlank
	private String autoRenewal;
	
	@NotNull
	private Date expiryDate;
	
	@Id
	@Column(name="subscriptionid")
	private String subscriptionid;
	
	
	public void setregId(String regid) throws InvalidIdLengthException {
		if(regid.length()<6)
		{
			throw new InvalidIdLengthException("id length is lesser or eqaul to 6");
		}
			
		this.regid = regid;
	}
	
	public void setAmount(int amount) {
		
		this.amount=amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscription other = (Subscription) obj;
		return amount == other.amount && autoRenewal == other.autoRenewal
				&& Objects.equals(dateofPurchase, other.dateofPurchase) && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(regid, other.regid) && Objects.equals(paymentMode, other.paymentMode)
				&& Objects.equals(status, other.status) && Objects.equals(type, other.type);
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, autoRenewal, dateofPurchase, expiryDate, regid, paymentMode, status, type);
	}
}
