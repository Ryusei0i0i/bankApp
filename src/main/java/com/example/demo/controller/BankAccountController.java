package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankAccount;
import com.example.demo.service.BankAccountService;

@RestController
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	@PostMapping("/accounts")
	public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount bankAccount) {
		
		BankAccount createdAccount = bankAccountService.createAccount(bankAccount);
		
		return ResponseEntity.ok(createdAccount);
	}
	
}
