package com.greatlearning.department.subclass;

import com.greatlearning.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	public String  departmentName () {
		return "Hr department";
		
	}
	public String getTodaysWork () {
		return "Fill today's timesheet and marks your attendance ";
		
	}
	public String getWorkDeadline () {
		return "Complete by Eod";
	
	}
	public String doActivity() {
		return "team lunch ";
		
	}

	}

	

