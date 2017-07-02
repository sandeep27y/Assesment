package com.spring.rest.service;

import java.sql.Date;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.spring.rest.DAO.PassengerDAOImpl;
import com.spring.rest.entity.CreditCardDetails;
import com.spring.rest.entity.PassengerProfile;

@Service
@Component
public class PassengerService{
	private static final Logger logger=org.slf4j.LoggerFactory.getLogger(PassengerService.class);
	@Autowired
	PassengerDAOImpl passengerDAO;

	@Autowired
	PassengerProfile passengerProfile;
	
	@Autowired
	CreditCardDetails creditCardDetails;
	public PassengerProfile getEmployeeInfo(int empNo) throws SQLException{
		PassengerProfile emp=passengerDAO.findPassenger(empNo);
		return emp;
		
	}

	public void addEmpInfo(PassengerProfile passesgerProfile) throws SQLException {
		// TODO Auto-generated method stub
//		employeeRepository.save(new Employee(employeeId, birthDate, firstName, lastName, gender, hiredDate, salary));
		logger.debug("2");
		//logger.debug(employee.getFirstName());
		passengerDAO.createPassenger(passesgerProfile);
	}

	public void updateEmpInfo(int employeeId, String firstName, String lastName, String gender, Date birthDate,
			Date hireDate) throws SQLException {
		// TODO Auto-generated method stub
		//passengerDAO.updateEmployee(employeeId,firstName,lastName,gender,birthDate,hireDate );
	}

	
}
