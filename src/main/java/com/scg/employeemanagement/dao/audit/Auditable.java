package com.scg.employeemanagement.dao.audit;

import com.scg.employeemanagement.dao.entity.Audit;

public interface Auditable {

	Audit getAudit();

	void setAudit(Audit audit);

}
