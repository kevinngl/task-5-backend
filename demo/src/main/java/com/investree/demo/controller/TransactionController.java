package com.investree.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investree.demo.dto.ResponseData;
import com.investree.demo.model.entities.Transaction;
import com.investree.demo.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<ResponseData<Transaction>> create(@Valid @RequestBody Transaction transaction,
            Errors errors) {
        ResponseData responseData = new ResponseData<>();
        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(transactionService.save(transaction));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<Transaction> findAll() {
        return transactionService.findAll();
    }

    @GetMapping("/{id}")
    public Transaction findOne(@PathVariable("id") Long id) {
        return transactionService.findOne(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseData<Transaction>> update(@Valid @RequestBody Transaction transaction,
            Errors errors) {
        ResponseData responseData = new ResponseData<>();
        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(transactionService.save(transaction));
        return ResponseEntity.ok(responseData);
    }
}
