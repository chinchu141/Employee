package com.scg.employeemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employeemanagement.dao.entity.Audit;
import com.scg.employeemanagement.vo.AuditVO;

@Mapper(componentModel = "spring")

public interface AuditMapper {

	AuditVO toVO(Audit audit);

	Audit toEntity(AuditVO auditVO);
}
