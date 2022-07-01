package com.investree.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.investree.demo.model.entities.PaymentHistory;

public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory, Long> {

}
