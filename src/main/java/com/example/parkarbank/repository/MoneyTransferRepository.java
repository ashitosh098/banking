package com.example.parkarbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parkarbank.entity.MoneyTransfer;

@Repository
public interface MoneyTransferRepository extends JpaRepository<MoneyTransfer, Long>{

}
