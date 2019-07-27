package com.sha.serverproductmanagement.repository;

import com.sha.serverproductmanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacctionRepository extends JpaRepository<Transaction, Long> {
}
