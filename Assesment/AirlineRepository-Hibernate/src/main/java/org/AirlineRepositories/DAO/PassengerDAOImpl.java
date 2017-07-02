package org.AirlineRepositories.DAO;

import org.AilrineRepositories.entity.PassengerProfile;
import org.AirlineReposoitories.utills.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PassengerDAOImpl implements PassengerDAO{
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
		PassengerProfile employee=(PassengerProfile) session.get(PassengerProfile.class, employeeNo);
		return employee;
	}

}
