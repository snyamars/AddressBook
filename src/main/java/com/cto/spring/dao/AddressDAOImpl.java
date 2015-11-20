package com.cto.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cto.spring.model.Address;

@Repository
public class AddressDAOImpl implements AddressDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(AddressDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addAddress(Address p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Address saved successfully, Address Details="+p);
	}

	@Override
	public void updateAddress(Address p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Address updated successfully, Address Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> listAddress() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Address> addressList = session.createQuery("from Address").list();
		for(Address p : addressList){
			logger.info("Address List::"+p);
		}
		return addressList;
	}

	@Override
	public Address getAddressById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Address p = (Address) session.load(Address.class, new Integer(id));
		logger.info("Address loaded successfully, Address details="+p);
		return p;
	}

	@Override
	public void removeAddress(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Address p = (Address) session.load(Address.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Address deleted successfully, Address details="+p);
	}

}
