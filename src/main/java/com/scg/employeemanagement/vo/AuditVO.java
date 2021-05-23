package com.scg.employeemanagement.vo;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class AuditVO {

	private String createdBy;

	private LocalDateTime createdTimestamp;

	private String lastUpdatedBy;

	private LocalDateTime lastUpdatedTimestamp;

	private Integer recordVersionNo;

}
