package org.AirlineRepository;

import java.util.Arrays;
import java.util.HashSet;

import org.AilrineRepositories.entity.CreditCardDetails;
import org.AilrineRepositories.entity.PassengerProfile;

import org.AirlineRepositories.DAO.PassengerDAOImpl;
import org.AirlineReposoitories.utills.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing");
			HibernateUtils.getSessionFactory();
		PassengerDAOImpl passengerDAOImpl = new PassengerDAOImpl();
		
		PassengerProfile passengerProfile = new PassengerProfile("32321", "Sandeep", "Kumar", "1452", "567464", "fdgf@gmail.com");
		
		CreditCardDetails creditCardDetails1 = new CreditCardDetails(4678756, "Visa", "March", 2022);
		
		creditCardDetails1.setPassengerProfile(passengerProfile);
		passengerProfile.setCreditCardDetails(creditCardDetails1);
		//CreditCardDetails creditCardDetails2 = new CreditCardDetails(46534543, "Master", "March", 2024);
		
		
		//creditCardDetails1.setPassesgerProfile(passesgerProfile);
		//creditCardDetails2.setPassesgerProfile(passesgerProfile);
		
		//passesgerProfile.setCreditCardDetails(new HashSet(Arrays.asList(creditCardDetails1, creditCardDetails2)));
		
			passengerDAOImpl.createPassenger(passengerProfile);
			
			PassengerProfile passengerProfile2=passengerDAOImpl.findPassenger(1);
			
			System.out.println("testing: "+passengerProfile2.getAddress());
	}

}
