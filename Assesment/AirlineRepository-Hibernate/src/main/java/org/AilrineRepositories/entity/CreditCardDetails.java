package org.AilrineRepositories.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
public class CreditCardDetails implements Serializable {

	

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "passengerProfile"))
	@Id
	@GeneratedValue(generator = "generator")
	  @Column(name="profile_id")
	private Integer profileId;

	  @Column(name="card_number")
	private Integer cardNumber;

	  @Column(name="card_type")
	private String cardType;

	  @Column(name="expiration_month")
	private String expirationMonth;

	  @Column(name="expiration_year")
	private Integer expirationYear;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private PassengerProfile passengerProfile;
	
	
	
	
	
	public CreditCardDetails() {
		super();
	}

	public CreditCardDetails(Integer cardNumber, String cardType, String expirationMonth,
			Integer expirationYear) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}

	@Override
	public String toString() {
		return "CreditCardDetails [profileId=" + profileId + ", cardNumber=" + cardNumber + ", cardType=" + cardType
				+ ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear + ", getProfileId()="
				+ getProfileId() + ", getCardNumber()=" + getCardNumber() + ", getCardType()=" + getCardType()
				+ ", getExpirationMonth()=" + getExpirationMonth() + ", getExpirationYear()=" + getExpirationYear()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public PassengerProfile getPassengerProfile() {
		return passengerProfile;
	}

	public void setPassengerProfile(PassengerProfile passengerProfile) {
		this.passengerProfile = passengerProfile;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public Integer getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}

}