package com.scg.employeemanagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employeemanagement.dao.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
