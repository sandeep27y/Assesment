package com.spring.rest.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.AirlineReposoitories.utills.HibernateUtils;

import com.spring.rest.entity.PassengerProfile;

@Repository
public class PassengerDAOImpl{
	@Autowired
	SessionFactory sessionFactory;
	
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

	public PassengerProfile findPassenger(int profileId) {
		System.out.println("gfghdhfgfd");
		PassengerProfile passengerProfile= sessionFactory.openSession().get(PassengerProfile.class, 1);
		/*Query query = sessionFactory.openSession().createQuery("from PassengerProfile where profileId = :code ");
		query.setParameter("code", 1);
		List list = query.list();
		PassengerProfile passengerProfile = (PassengerProfile) list.get(0);*/
		if(passengerProfile==null){
			System.out.println("returning null");
		}else{
			System.out.println("Not null");
		}
		return passengerProfile;
	}


}
