package org.AirlineRepositories.DAO;

import org.AilrineRepositories.entity.PassengerProfile;

public interface PassengerDAO {

	PassengerProfile createPassenger(PassengerProfile passesgerProfile);
	void deletePassenger(int profileId);
	PassengerProfile updatePassenger(PassengerProfile passesgerProfile);
	PassengerProfile findPassenger(int employeeNo);
	
}
