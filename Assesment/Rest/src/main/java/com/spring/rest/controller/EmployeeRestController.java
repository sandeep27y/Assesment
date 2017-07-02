package com.spring.rest.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entity.PassengerProfile;
import com.spring.rest.service.PassengerService;


@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/passengers")
public class EmployeeRestController {
	@Autowired
	PassengerService passengerService;
	
	@RequestMapping(value="/{employeeId}", method=RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
			MediaType.TEXT_HTML_VALUE})
	public ResponseEntity<?> getPsssengerDetails(@PathVariable String employeeId) throws SQLException {
		int empNo = Integer.parseInt(employeeId);
		
		
		PassengerProfile passengerProfile = passengerService.getEmployeeInfo(empNo);
		System.out.println("fhgf: "+passengerProfile.getAddress());
		if(passengerProfile == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {				
			return new ResponseEntity<>(passengerProfile, HttpStatus.ACCEPTED);
		}
	}
	

}

