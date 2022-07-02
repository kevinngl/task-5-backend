package com.investree.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investree.demo.model.entities.Transaction;
import com.investree.demo.model.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Iterable<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Transaction findOne(Long id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if (!transaction.isPresent()) {
            return null;
        }
        return transaction.get();
    }
}
