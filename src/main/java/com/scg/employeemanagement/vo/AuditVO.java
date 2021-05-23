package com.scg.employeemanagement.vo;

import java.time.LocalDateTime;

import lombok.Data;


@Data

public class AuditVO {

	private String createdBy;

	private LocalDateTime createdTimestamp;

	private String lastUpdatedBy;

	private LocalDateTime lastUpdatedTimestamp;

	private Integer recordVersionNo;

}
