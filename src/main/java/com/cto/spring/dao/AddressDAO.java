package com.cto.spring.dao;

import java.util.List;

import com.cto.spring.model.Address;

public interface AddressDAO {

	public void addAddress(Address p);
	public void updateAddress(Address p);
	public List<Address> listAddress();
	public Address getAddressById(int id);
	public void removeAddress(int id);
}
