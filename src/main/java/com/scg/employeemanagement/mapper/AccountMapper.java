package com.scg.employeemanagement.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employeemanagement.dao.entity.Account;

import com.scg.employeemanagement.vo.AccountVO;


@Mapper(
	    componentModel = "spring"
	)

public interface AccountMapper {
	
	Account toEntity (AccountVO accountVO);
	List<AccountVO>  toVO (List<Account> list);
	AccountVO  toVO (Account account);

}
