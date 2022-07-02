package com.investree.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.investree.demo.model.entities.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
