package com.scg.employeemanagement.dao.audit;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.stereotype.Component;

import com.scg.employeemanagement.dao.entity.Audit;

@Component
public class AuditListener {
	
	private String user = System.getProperty("user.name");
	private LocalDateTime now = LocalDateTime.now();

	@PrePersist
	public void setCreate(final Auditable auditable) {

		Audit audit = auditable.getAudit();

		if (audit == null) {
			audit = new Audit();
			auditable.setAudit(audit);
		}

		audit.setCreatedTimestamp(now);
		audit.setLastUpdatedTimestamp(now);
		audit.setRecordVersionNo(10);
		audit.setCreatedBy(user);
		audit.setLastUpdatedBy(user);

	}

	@PreUpdate
	public void setUpdadtedOn(final Auditable auditable) {

		var audit = auditable.getAudit();
		audit.setLastUpdatedTimestamp(now);
		audit.setRecordVersionNo(Integer.valueOf(audit.getRecordVersionNo() + 1));
		audit.setLastUpdatedBy(user);
	}
}
