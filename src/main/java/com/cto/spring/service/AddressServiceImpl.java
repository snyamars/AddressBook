package com.cto.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cto.spring.dao.AddressDAO;
import com.cto.spring.model.Address;

@Service
public class AddressServiceImpl implements AddressService {
	
	private AddressDAO addressDAO;

	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}

	@Override
	@Transactional
	public void addAddress(Address p) {
		this.addressDAO.addAddress(p);
	}

	@Override
	@Transactional
	public void updateAddress(Address p) {
		this.addressDAO.updateAddress(p);
	}

	@Override
	@Transactional
	public List<Address> listAddress() {
		return this.addressDAO.listAddress();
	}

	@Override
	@Transactional
	public Address getAddressById(int id) {
		return this.addressDAO.getAddressById(id);
	}

	@Override
	@Transactional
	public void removeAddress(int id) {
		this.addressDAO.removeAddress(id);
	}

}
