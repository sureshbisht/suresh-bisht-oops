package com.greatlearning.department.subclass;

import com.greatlearning.superdepartment.SuperDepartment;

public class AdminDepartment extends  SuperDepartment{
	public String  departmentName () {
		return "Admin department";
		
	}
	public String getTodaysWork () {
		return " Complete your documents submission ";
		
	}
	public String getWorkDeadline () {
		return "Complete by Eod";
	
	}

		
	}
