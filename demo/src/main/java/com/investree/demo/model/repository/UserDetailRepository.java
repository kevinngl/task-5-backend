package com.investree.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.investree.demo.model.entities.UserDetail;

public interface UserDetailRepository extends CrudRepository<UserDetail, Long> {

}
