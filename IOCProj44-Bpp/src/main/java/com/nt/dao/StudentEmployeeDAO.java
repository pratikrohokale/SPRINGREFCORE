package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class StudentEmployeeDAO {
	
	public void insertStudent(StudentBO bo){
		 System.out.println("inserting Student..."+bo);
	}
	
	public void  insertEmployee(EmployeeBO bo){
		 System.out.println("inserting Employee..."+bo);
	}

}
