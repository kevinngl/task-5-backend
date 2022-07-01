package com.investree.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.investree.demo.model.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
