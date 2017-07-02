package com.spring.rest.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.AirlineReposoitories.utills.HibernateUtils;

import com.spring.rest.entity.PassengerProfile;

@Repository
public class PassengerDAOImpl{
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	public PassengerProfile createPassenger(PassengerProfile passesgerProfile) {
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.save(passesgerProfile);
			transaction.commit();
		}catch(Exception e){
			transaction.rollback();
		}finally{
			session.close();
		}
		return null;
	}

	public void deletePassenger(int profileId) {
		// TODO Auto-generated method stub
		
	}

	public PassengerProfile updatePassenger(PassengerProfile passesgerProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	public PassengerProfile findPassenger(int employeeNo) {
		Session session = sessionFactory.openSession();
		System.out.println("fdgfd");
		PassengerProfile passengerProfile=(PassengerProfile) session.get(PassengerProfile.class, new Integer(employeeNo));
		System.out.println("Before");
		return passengerProfile;
	}


}
