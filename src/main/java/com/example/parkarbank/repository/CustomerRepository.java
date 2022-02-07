package com.example.parkarbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.parkarbank.entity.BankUser;

@Repository
public interface CustomerRepository extends JpaRepository<BankUser, Long>{

	@Query("Select c from BankUser c WHERE c.email = ?1")
	BankUser getCustomerEmail(String email);

	


}
