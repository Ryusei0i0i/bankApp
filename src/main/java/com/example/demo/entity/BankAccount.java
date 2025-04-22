package com.example.demo.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="bank_account")
public class BankAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="owner_name")
	private String ownerName;
	
	@Column(name="balance")
	private Double balance;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	
	@Column(name="user_id")
	private Long userId;
}
