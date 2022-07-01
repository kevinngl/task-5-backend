package com.investree.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.investree.demo.model.entities.Transaction;

public interface TransaksiRepository extends CrudRepository<Transaction, Long> {

}
