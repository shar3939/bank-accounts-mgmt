package com.sharath.microservices.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharath.microservices.bank.model.Account;

@RestController
@RequestMapping(path = "/bank")
public class BankMgmtController {
	
	@Autowired
	private Account account;  


	@GetMapping(path = "/accntDtls")
	public Account getAccntDtls() {
		
		Account act = new Account(account.getFirstName(),account.getLastName(), 890093343, 3435.3d, "Hyderabad", 987656789); 
		return act;
	}
}
