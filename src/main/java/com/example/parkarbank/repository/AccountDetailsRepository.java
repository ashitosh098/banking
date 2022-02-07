package com.example.parkarbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.parkarbank.entity.AccountDetails;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long> {

	@Query("SELECT a From AccountDetails a WHERE a.accountNumber = ?1")
	AccountDetails fetchAccountDetails(String accountNumber);
	
	@Modifying
	@Transactional
	@Query("Update AccountDetails a set a.accountBalance=?1 Where a.accountNumber=?2")
	int updateAccountBalance(long accountBalance, String accountNumber);



}
