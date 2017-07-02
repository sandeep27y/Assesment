package org.AilrineRepositories.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity // This tells Hibernate to make a table out of this class
public class PassengerProfile implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="profile_id")
    private Integer profileId;
    
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
    
    @Column(name="address")
    private String address;
    
    @Column(name="tel_no")
    private String telNo;
    
    @Column(name="email_id")
    private String emailId;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "passengerProfile", cascade = CascadeType.ALL)
	private CreditCardDetails creditCardDetails;
    
    
 
    
    public PassengerProfile() {
		super();
	}

	public PassengerProfile(String password, String firstName, String lastName, String address,
			String telNo, String emailId) {
		super();
	
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telNo = telNo;
		this.emailId = emailId;
	}
    
    public CreditCardDetails getCreditCardDetails() {
		return creditCardDetails;
	}

	public void setCreditCardDetails(CreditCardDetails creditCardDetails) {
		this.creditCardDetails = creditCardDetails;
	}

	
	private String password;

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
    
   

	@Override
	public String toString() {
		return "PassengerProfile [profileId=" + profileId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", telNo=" + telNo + ", emailId=" + emailId + ", getProfileId()="
				+ getProfileId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAddress()=" + getAddress() + ", getTelNo()=" + getTelNo() + ", getEmailId()=" + getEmailId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	


}