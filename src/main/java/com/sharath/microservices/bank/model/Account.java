package com.sharath.microservices.bank.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author shar939
 *
 */
@Component
@ConfigurationProperties("bank-accounts-mgmt-one")
public class Account {
	
	//@Value("${firstName}")
	private String firstName;
	
	private String lastName;
	
	private Integer accountNumber;
	private double balance;
	private String address;
	private Integer phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Account(String firstName, String lastName, Integer accountNumber, double balance, String address,
			Integer phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

}
