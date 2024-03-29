package com.sha.serverproductmanagement.service;

import com.sha.serverproductmanagement.model.Transaction;
import com.sha.serverproductmanagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // POST
    @Override
    public Transaction saveTransaction(final Transaction transaction){
        return transactionRepository.save(transaction);
    }

    // NUMBER OF TRANSACTIONS
    @Override
    public Long numberOfTransactions(){
        return transactionRepository.count();
    }

    // FIND ALL
    @Override
    public List<Transaction> findAllTransactions(){
        return transactionRepository.findAll();
    }
}
