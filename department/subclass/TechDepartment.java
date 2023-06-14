package com.greatlearning.department.subclass;

import com.greatlearning.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public String  departmentName () {
		return "tech department";
		
	}
	public String getTodaysWork () {
		return " Complete coding of modal 1 ";
		
	}
	public String getWorkDeadline () {
		return "complete by EOD";
	
	}
	public String getTechStackInformation () {
		return " core java";
		
	}
}