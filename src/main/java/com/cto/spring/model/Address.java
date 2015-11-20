package com.cto.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 *
 */
@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;


	private String firstname;
	
	private String lastname;
	
	private String surname;
	
	private String addressline1;
	
	private String addressline2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String phonenumber;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getAddressline1() {
		return addressline1;
	}


	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}


	public String getAddressline2() {
		return addressline2;
	}


	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	

	@Override
	public String toString(){
		return "id="+id+", name="+firstname+", lastname="+lastname;
	}

}
