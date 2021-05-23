package com.scg.employeemanagement.exception;

import com.scg.employeemanagement.vo.DepartmentVO;
import com.scg.employeemanagement.vo.EmployeeVO;

public class Validator {

	public static void validate(EmployeeVO employeeVO) throws ApiException {
		if (employeeVO.getEmployeeName().length() < 0
				|| employeeVO.getEmployeeName().matches("[a-zA-Z][a-zA-Z]*") == false) {

			throw new ApiException(ErrorCode.INVALID_NAME);

		}
	}

	public static void validateId(int id) throws ApiException {
		if (id < 1) {
			throw new ApiException(ErrorCode.INVALID_ID);
		}

	}

	public static void validateDepartment(DepartmentVO departmentVO) throws ApiException {
		if (departmentVO.getDepartmentName().length() < 0
				|| departmentVO.getDepartmentName().matches("[a-zA-Z][a-zA-Z]*") == false) {

			throw new ApiException(ErrorCode.INVALID_NAME);

		}
	}

}
