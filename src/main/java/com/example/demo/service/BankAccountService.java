package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BankAccount;
import com.example.demo.repository.BankAccountRepository;

@Service
public class BankAccountService {
	@Autowired
    private BankAccountRepository bankAccountRepository;
	
	public BankAccount createAccount(BankAccount bankAccount) { 
		return bankAccountRepository.save(bankAccount);
	}
}
